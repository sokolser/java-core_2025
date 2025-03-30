package lr3.Test.Test2;// добавление в конец

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("Время добавления в конец ArrayDeque: " + getRunningTimeDeque(arrayDeque));
        System.out.println("Время добавления в конец LinkedList: " + getRunningTimeDeque(linkedList));
        System.out.println("Время добавления в конец TreeSet: " + getRunningTimeSet(treeSet));
    }

    private static long getRunningTimeDeque(Deque<Integer> deque) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 13000000; i++) {
            deque.addLast(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeSet(Set<Integer> set) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 13000000; i++) {
            set.add(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}