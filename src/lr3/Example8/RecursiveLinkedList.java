package lr3.Example8;

public class RecursiveLinkedList extends LinkedList {

    public RecursiveLinkedList() {
        super();
    }

    // Ввод с головы (рекурсия)
    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, 0);
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index == values.length) return null;
        return new Node(values[index], createHeadRecHelper(values, index+1));
    }

    // Ввод с хвоста (рекурсия)
    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, values.length - 1);
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index < 0) return null;
        Node node = createTailRecHelper(values, index - 1);
        if (node == null) {
            return new Node(values[index]);
        } else {
            Node ref = node;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = new Node(values[index]);
            return node;
        }
    }

    // Вывод списка (рекурсия)
    public String toStringRec() {
        return toStringRecHelper(head).trim();
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        return node.value + " " + toStringRecHelper(node.next);
    }
}