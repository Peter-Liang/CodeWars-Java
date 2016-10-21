import java.util.HashSet;
import java.util.LinkedList;

/**
 * 3 kyu: Can you get the loop ?
 * https://www.codewars.com/kata/52a89c2ea8ddc5547a000863/train/java
 */
public class LoopInspector {

    public int loopSize(Node node) {
        HashSet<Node> nodes = new HashSet<>();
        LinkedList<Node> list = new LinkedList<>();

        while (node != null) {
            if (nodes.contains(node)) break;

            nodes.add(node);
            list.offer(node);
            node = node.getNext();
        }

        int tail = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == node) {
                tail = i;
                break;
            }
        }

        return nodes.size() - tail;
    }

    private class Node {
        public Node getNext() {
            return null;
        }
    }
}
