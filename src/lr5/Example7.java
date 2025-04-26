package lr5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("\n" + "Список до:  " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        System.out.print("\nВведите делитель: ");
        int divisor = in.nextInt();

        List<Integer> integersAfter = filterDivisor(integers, divisor);

        System.out.println("\n" + "Числа, которые делятся без остатка на " + divisor + ":\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }

    }

    public static List<Integer> filterDivisor(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}