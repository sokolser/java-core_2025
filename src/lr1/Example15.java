package lr1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int chislo1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int chislo2 = in.nextInt();


        int sum = chislo1 + chislo2;
        int razn = chislo1 - chislo2;

        System.out.println("Сумма чисел равно " + sum + ", разность чисел равна " + razn);
        in.close();
    }
}
