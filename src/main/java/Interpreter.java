import java.security.InvalidParameterException;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 2 kyu: Simpler Interactive Interpreter
 * https://www.codewars.com/kata/simpler-interactive-interpreter/train/java
 */
public class Interpreter {
    private static final String IS_NUMBER = "[0-9]*\\.?[0-9]+";
    private final HashMap<String, Double> vars = new HashMap<>();

    private static Deque<String> tokenize(String input) {
        Deque<String> tokens = new LinkedList<>();
        Pattern pattern = Pattern.compile("=>|[-+*/%=\\(\\)]|[A-Za-z_][A-Za-z0-9_]*|[0-9]*(\\.?[0-9]+)");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            tokens.add(m.group());
        }
        return tokens;
    }

    private void removeParenthesis(Deque<String> tokens) {
        if (tokens.size() <= 3) {
            return;
        }

        while (tokens.contains(")")) {
            Deque<String> tempTokens = new LinkedList<>();
            String token = tokens.pollFirst();
            while (!token.equals(")")) {
                tempTokens.addLast(token);
                token = tokens.pollFirst();
            }

            Deque<String> subTokens = new LinkedList<>();
            token = tempTokens.pollLast();
            while (!token.equals("(")) {
                subTokens.addFirst(token);
                token = tempTokens.pollLast();
            }
            String subInput = subTokens.stream().collect(Collectors.joining());
            Double subResult = input(subInput);
            tokens.addFirst(subResult.toString());
            while (tempTokens.size() > 0) {
                tokens.addFirst(tempTokens.pollLast());
            }

        }
    }

    private void calculateHighPriority(Deque<String> tokens) {
        if (tokens.size() <= 3) {
            return;
        }

        while (tokens.contains("*") || tokens.contains("/") || tokens.contains("%")) {
            Deque<String> tempTokens = new LinkedList<>();
            String token = tokens.pollFirst();
            while (!token.equals("*") && !token.equals("/") && !token.equals("%")) {
                tempTokens.addLast(token);
                token = tokens.pollFirst();
            }

            Deque<String> subTokens = new LinkedList<>();
            subTokens.addLast(tempTokens.pollLast());
            subTokens.addLast(token);
            subTokens.addLast(tokens.pollFirst());
            String subInput = subTokens.stream().collect(Collectors.joining());
            Double subResult = input(subInput);
            tokens.addFirst(subResult.toString());
            while (tempTokens.size() > 0) {
                tokens.addFirst(tempTokens.pollLast());
            }
        }
    }


    public Double input(String input) {
        if (input.trim().isEmpty()) {
            throw new InvalidParameterException("input cannot be null");
        }

        Deque<String> tokens = tokenize(input);
        removeParenthesis(tokens);
        calculateHighPriority(tokens);

        while (tokens.size() > 3) {
            String subRhv = tokens.pollLast();
            String subOperator = tokens.pollLast();
            String subLhv = tokens.pollLast();

            Double subResult = input(subLhv + subOperator + subRhv);
            tokens.addLast(subResult.toString());
        }

        Double rhv = getValue(tokens.pollLast());

        if (tokens.isEmpty()) {
            return rhv;
        }

        String operator = tokens.pollLast();
        if (operator.equals("=")) {
            vars.put(tokens.pollLast(), rhv);
            return rhv;
        }

        Double lhv = getValue(tokens.pollLast());

        return computeValue(lhv, rhv, operator);
    }

    private Double getValue(String value) {
        if (value.matches(IS_NUMBER)) return Double.parseDouble(value);
        else {
            if (!vars.containsKey(value)) {
                throw new InvalidParameterException();
            }
            return vars.get(value);
        }
    }

    private Double computeValue(Double lhv, Double rhv, String operator) {
        switch (operator) {
            case "+":
                return lhv + rhv;
            case "-":
                return lhv - rhv;
            case "*":
                return lhv * rhv;
            case "/":
                return lhv / rhv;
            case "%":
                return lhv % rhv;

            default:
                throw new InvalidParameterException();
        }
    }
}
