package lr4;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            String sizeInput = scanner.next(); // Читаем как строку
            int size = Integer.parseInt(sizeInput); // Парсим в число → возможен NumberFormatException

            int[] arr = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                String numInput = scanner.next(); // Читаем как строку
                arr[i] = Integer.parseInt(numInput); // Парсим в число → возможен NumberFormatException
            }

            double avg = calculateAverage(arr);
            System.out.println("Среднее положительных элементов: " + avg);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Введено не число или число в неверном формате!");
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Введена строка вместо числа!");
        } catch (NoPositiveElementsException e) {
            System.err.println("Ошибка: В массиве нет положительных элементов!");
        } finally {
            scanner.close();
        }
    }

    public static double calculateAverage(int[] arr) throws NoPositiveElementsException {
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        if (count == 0) {
            throw new NoPositiveElementsException();
        }
        return (double) sum / count;
    }
}

class NoPositiveElementsException extends Exception {
    public NoPositiveElementsException() {
        super("Нет положительных элементов!");
    }
}