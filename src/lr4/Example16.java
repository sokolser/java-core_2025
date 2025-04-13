package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите номер столбца: ");
            int column = scanner.nextInt();

            System.out.println("Столбец " + column + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][column]);
            }
        } catch (InputMismatchException e) {
            System.err.println("Ошибка: Введена строка вместо числа!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: Столбец не существует!");
        } finally {
            scanner.close();
        }
    }
}