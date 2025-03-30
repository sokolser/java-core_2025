package lr3.Example7; //создание с хвоста

public class Тest2 {public static void main(String[] args) {
    Node2 head = null;
    Node2 tail = null;

    // Добавление элементов с хвоста
    for (int i = 0; i <= 9; i++) {
        Node2 newNode = new Node2 (i);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Вывод списка
    printList(head);
}

    static void printList(Node2 head) {
        Node2 ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}
