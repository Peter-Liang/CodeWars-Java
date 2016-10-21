import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        CodeHere();
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (end - start) + "ms");
    }

    private static void CodeHere() {
//        System.out.println(Dioph.solEquaStr(900000009));
        long result = 1;
        for (int i = 0; i < 27165; i++) {
            result *= 2;
        }
        System.out.println(368982196 / 27165);
//        System.out.println("[[450000005, 225000002], [150000003, 75000000], [50000005, 24999998], [26470597, 13235290], [8823555, 4411752], [2941253, 1470550]]");
//        System.out.println(Dioph.solEquaStr(9000000041l));
//        Collection<String> data = Arrays.asList("Snap", "Crackle", "Pop");
//        System.out.println(data.stream().collect(Collectors.joining(", ")));
//        System.out.println(String.join(", ", data));
//        char ch = '1';
//        System.out.println(new StringJoiner(Stream.generate(() -> ch).map(c->).limit(300).toArray()).toString());
//        System.out.println(Stream.generate(()->ch).limit(300).map(Object::toString).collect(Collectors.joining()));
//        char[] chars = new char[300];
//        Arrays.fill(chars, ch);
//        String s = new String(chars);
//        System.out.println(CoreMatchers.class);
//        System.out.println(MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"));
//        assertThat(MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"), is(".... . -..-.-.   .-.-.-. ..-. -... "));
//        System.out.println(Stream.generate(() -> "1").limit(3).collect(StringJoiner::new, StringJoiner::add, StringJoiner::merge));

    }
}
