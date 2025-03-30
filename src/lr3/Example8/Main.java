package lr3.Example8;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        RecursiveLinkedList recList = new RecursiveLinkedList();

        // Тест ввода с головы (цикл)
        list.createHead(new int[]{1, 2, 3, 4, 5});
        System.out.println("Создано с головы (цикл): " + list.toString());

        // Тест ввода с хвоста (цикл)
        list.createTail(new int[]{1, 2, 3, 4, 5});
        System.out.println("Создано с хвоста (цикл): " + list.toString());

        // Добавление элементов
        list.AddFirst(0);
        System.out.println("Добавлен 0 в начало: " + list.toString());

        list.AddLast(6);
        System.out.println("Добавлен 6 в конец: " + list.toString());

        list.Insert(3, 99);
        System.out.println("Вставлен 99 на позицию 3: " + list.toString());

        // Удаление элементов
        list.RemoveFirst();
        System.out.println("Удален первый элемент: " + list.toString());

        list.RemoveLast();
        System.out.println("Удален последний элемент: " + list.toString());

        list.Remove(2);
        System.out.println("Удален элемент на позиции 2: " + list.toString());

        // Тест ввода с головы (рекурсия)
        recList.createHeadRec(new int[]{10, 20, 30, 40, 50});
        System.out.println("Создано с головы (рекурсия): " + recList.toStringRec());

        // Тест ввода с хвоста (рекурсия)
        recList.createTailRec(new int[]{10, 20, 30, 40, 50});
        System.out.println("Создано с хвоста (рекурсия): " + recList.toStringRec());
    }
}