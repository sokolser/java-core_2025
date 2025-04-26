package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example9 {
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
        int bluc = in.nextInt();

        List<Integer> integersAfter = filterObladaet(integers, bluc);

        System.out.println("\n" + "Числа, значения которых больше чем " + bluc + ":\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> filterObladaet(List<Integer> list, int bluc) {
        return list.stream()
                .filter(x -> x > bluc)
                .collect(Collectors.toList());
    }

}
