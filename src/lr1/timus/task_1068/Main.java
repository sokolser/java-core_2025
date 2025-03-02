package lr1.timus.task_1068;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int sum = 0;

        if (N < 0) {

            for (int i = N; i <= 1; i++) {
                sum += i;
            }
        } else {

            for (int i = 1; i <= N; i++) {
                sum += i;
            }
        }

        if (N < 0) {
            System.out.println("Сумма всех целых чисел от " + N + " до 1 равна: " + sum);
        } else {
            System.out.println("Сумма всех целых чисел от 1 до " + N + " равна: " + sum);
        }
    }
}
