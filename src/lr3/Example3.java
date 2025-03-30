package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(scanner, array, 0);

        System.out.println("Элементы массива:");
        printArray(array, 0);

        scanner.close();
    }

    // Рекурсивный метод для ввода массива
    public static void inputArray(Scanner scanner, int[] array, int index) {
        if (index < array.length) {
            System.out.print("Элемент " + index + ": ");
            array[index] = scanner.nextInt();
            inputArray(scanner, array, index + 1);
        }
    }

    // Рекурсивный метод для вывода массива
    public static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println("Элемент " + index + ": " + array[index]);
            printArray(array, index + 1);
        }
    }
}
