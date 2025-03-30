package lr3;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Пожалуйста, введите неотрицательное целое число.");
        } else {
            System.out.println("Двоичное представление числа " + number + ": " + toBinary(number));
        }

        scanner.close();
    }

    public static String toBinary(int n) {

        if (n == 0) {
            return "0";
        }

        return toBinary(n / 2) + (n % 2);
    }
}
