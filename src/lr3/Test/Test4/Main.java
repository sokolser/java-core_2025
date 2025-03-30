package lr3.Test.Test4; // Удаление в начале

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 13000000; i++) {
            arrayDeque.add(i);
            linkedList.add(i);
            treeSet.add(i);
        }
        System.out.println("Время удаления из начала ArrayDeque: " + removeFirstTime(arrayDeque));
        System.out.println("Время удаления из начала LinkedList: " + removeFirstTime(linkedList));
        System.out.println("Время удаления из начала TreeSet: " + removeFirstTimeTreeSet(treeSet));
    }
    private static long removeFirstTime(Deque<Integer> deque) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            deque.removeFirst();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long removeFirstTimeTreeSet(TreeSet<Integer> treeSet) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            treeSet.pollFirst();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}