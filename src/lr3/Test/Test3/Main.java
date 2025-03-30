package lr3.Test.Test3; //добавление в середину
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Время вставки в середину ArrayDeque: " + getRunningTimeForDeque(arrayDeque) + " мс");
        System.out.println("Время вставки в середину LinkedList: " + getRunningTimeForList(linkedList) + " мс");
    }
    private static long getRunningTimeForDeque(Deque<Integer> deque) {
        for (int i = 0; i < 13000000; i++) {
            deque.addLast(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int middle = deque.size() / 2;
            List<Integer> temp = new ArrayList<>(deque);
            temp.add(middle, -1);
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
            list.add(list.size() / 2, -1);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}