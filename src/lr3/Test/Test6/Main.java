package lr3.Test.Test6;//удаление из середины

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Время удаления из середины ArrayDeque: " + getRunningTimeForDeque(arrayDeque) + " мс");
        System.out.println("Время удаления из середины LinkedList: " + getRunningTimeForList(linkedList) + " мс");
    }
    private static long getRunningTimeForDeque(Deque<Integer> deque) {
        for (int i = 0; i < 13000000; i++) {
            deque.addLast(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int middle = deque.size() / 2;
            List<Integer> temp = new ArrayList<>(deque);
            temp.remove(middle);
            deque.clear();
            deque.addAll(temp);
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
            list.remove(list.size() / 2);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}