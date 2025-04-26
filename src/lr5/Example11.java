package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("\n" + "Список до:  " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        System.out.print("\nВведите число: ");
        int konda = in.nextInt();

        List<Integer> integersAfter = filterJeembo(integers, konda);

        System.out.println("\n" + "Числа, значения которых меньше чем " + konda + ":\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> filterJeembo(List<Integer> list, int konda) {
        return list.stream()
                .filter(x -> x < konda)
                .collect(Collectors.toList());
    }

}
