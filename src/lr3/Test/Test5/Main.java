package lr3.Test.Test5;// Удаление в конце

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Заполняем коллекции 13 млн элементов
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 13000000; i++) {
            arrayDeque.add(i);
            linkedList.add(i);
            treeSet.add(i);
        }

        // Тестируем удаление из конца (1000 операций)
        System.out.println("Время удаления с конца ArrayDeque: " + removeLastTime(arrayDeque, 100000));
        System.out.println("Время удаления с конца LinkedList: " + removeLastTime(linkedList, 100000));
        System.out.println("Время удаления с конца TreeSet: " + removeLastTimeTreeSet(treeSet, 100000));
    }

    // Для ArrayDeque и LinkedList
    private static long removeLastTime(Deque<Integer> deque, int operations) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            deque.removeLast();
        }
        return System.currentTimeMillis() - start;
    }

    // Для TreeSet (удаляем максимальный элемент)
    private static long removeLastTimeTreeSet(TreeSet<Integer> treeSet, int operations) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < operations; i++) {
            treeSet.pollLast(); // Удаляет последний (максимальный) элемент
        }
        return System.currentTimeMillis() - start;
    }
}