package lr3.Test.Test1; //добваление в начало

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Deque;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("Время добавления в начало ArrayDeque: " + getRunningTimeAddFirst(arrayDeque) + " мс");
        System.out.println("Время добавления в начало LinkedList: " + getRunningTimeAddFirst(linkedList) + " мс");

        // TreeSet не поддерживает добавление в начало, поэтому просто добавляем элементы
        System.out.println("Время добавления в TreeSet (автоматическая сортировка): " + getRunningTimeAdd(treeSet) + " мс");
    }

    // Метод для измерения времени добавления в начало (addFirst)
    private static long getRunningTimeAddFirst(Deque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1300000; i++) {
            deque.addFirst(i);  // Добавляем в начало
        }
        return System.currentTimeMillis() - start;
    }

    // Метод для измерения времени обычного добавления в TreeSet
    private static long getRunningTimeAdd(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1300000; i++) {
            set.add(i);  // TreeSet автоматически сортирует элементы
        }
        return System.currentTimeMillis() - start;
    }
}
