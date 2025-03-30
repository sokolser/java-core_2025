package lr3.Example8;

public class LinkedList {
    protected Node head;

    public LinkedList() {
        this.head = null;
    }

    // Ввод с головы (цикл)
    public void createHead(int[] values) {
        for (int value : values) {
            head = new Node(value, head);
        }
    }

    // Ввод с хвоста (цикл)
    public void createTail(int[] values) {
        if (values.length == 0) return;
        head = new Node(values[0]);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i]);
            tail = tail.next;
        }
    }

    // Вывод списка (цикл)
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            result.append(ref.value).append(" ");
            ref = ref.next;
        }
        return result.toString().trim();
    }

    // Добавление в начало списка
    public void AddFirst(int value) {
        head = new Node(value, head);
    }

    // Добавление в конец списка
    public void AddLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = new Node(value);
    }

    // Вставка элемента в список по индексу
    public void Insert(int index, int value) {
        if (index == 0) {
            AddFirst(value);
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null) {
            ref.next = new Node(value, ref.next);
        }
    }

    // Удаление первого элемента
    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Удаление последнего элемента
    public void RemoveLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    // Удаление элемента по индексу
    public void Remove(int index) {
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null && ref.next != null) {
            ref.next = ref.next.next;
        }
    }
}