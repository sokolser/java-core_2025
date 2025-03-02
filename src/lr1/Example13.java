package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first = in.nextInt();


        System.out.println("Введите второе число: ");
        int second = in.nextInt();


        int sum = first + second;

        System.out.println("Сумма чисел равна " + sum);
        in.close();
    }
}
