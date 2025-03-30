package lr3.Example6;

import java.util.ArrayList;

public class Example6_1 {
    public static void main(String[] args) {
        int N = 10; // количество человек
        ArrayList<Integer> circle = new ArrayList<>();

        // Заполняем список
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size(); // переход к следующему человеку
            circle.remove(index); // удаляем каждого второго
        }

        System.out.println("Последний оставшийся (ArrayList): " + circle.get(0));
    }
}
