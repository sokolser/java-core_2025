package lr3.Example4;

public class Node { // Класс - структура элемента списка

    public int value; // значение
    public Node next; // поле - ссылка (указатель) на следующий узел

    Node(int value, Node next) { // конструктор класса
        this.value = value;
        this.next = next;
    }
}
