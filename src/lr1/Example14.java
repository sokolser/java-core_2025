package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int chislo = in.nextInt();

        int minus = chislo - 1;
        int plus = chislo + 1;
        int square = (chislo + minus + plus)*(chislo + minus + plus);

        System.out.println("Получившиеся числа: " + minus + ", " + chislo + ", " + plus + ", " + square);
        in.close();
    }
}
