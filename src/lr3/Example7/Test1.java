package lr3.Example7; //создание с головы

public class Test1 {

    public static void main(String[] args) {
        Node1 head = null;

        // Добавление элементов с головы
        for (int i = 9; i >= 0; i--) {
            head = new Node1(i, head);
        }

        // Вывод списка
        printList(head);
    }

    static void printList(Node1 head) {
        Node1 ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}
