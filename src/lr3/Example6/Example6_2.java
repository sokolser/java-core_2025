package lr3.Example6;

import java.util.LinkedList;

public class Example6_2 {
    public static void main(String[] args) {
        int N = 10; // количество человек
        LinkedList<Integer> circle = new LinkedList<>();

        // Заполняем список
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size(); // переход к следующему человеку
            circle.remove(index); // удаляем каждого второго
        }

        System.out.println("Последний оставшийся (LinkedList): " + circle.get(0));
    }
}
