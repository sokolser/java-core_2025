package lr3.Test.Test7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Время получения элемента по индексу в ArrayDeque: " + getRunningTimeForDeque(arrayDeque) + " мс");
        System.out.println("Время получения элемента по индексу в LinkedList: " + getRunningTimeForList(linkedList) + " мс");
        System.out.println("Время получения элемента по индексу в TreeSet: " + getRunningTimeForTreeSet(treeSet) + " мс");
    }

    private static long getRunningTimeForDeque(Deque<Integer> deque) {
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < 13000000; i++) {
            deque.addLast(i);
            tempList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int value = tempList.get(tempList.size() / 2);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeForList(List<Integer> list) {
        for (int i = 0; i < 13000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int value = list.get(list.size() / 2);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeForTreeSet(TreeSet<Integer> treeSet) {
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < 13000000; i++) {
            treeSet.add(i);
            tempList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int value = tempList.get(tempList.size() / 2);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}