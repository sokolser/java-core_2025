package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            byte[] arr = new byte[size];

            System.out.println("Введите элементы массива (byte от -128 до 127):");
            for (int i = 0; i < size; i++) {
                int num = scanner.nextInt();
                if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Число выходит за пределы byte!");
                }
                arr[i] = (byte) num;
            }

            byte sum = calculateSum(arr);
            System.out.println("Сумма элементов: " + sum);
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Введена строка вместо числа!");
        } catch (ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static byte calculateSum(byte[] arr) {
        byte sum = 0;
        for (byte num : arr) {
            sum += num;
        }
        return sum;
    }
}