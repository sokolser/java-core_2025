package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        fillSnakePattern(array, rows, cols);
        printArray(array);
    }

    private static void fillSnakePattern(int[][] array, int rows, int cols) {
        int value = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Четные строки слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else { // Нечетные строки справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
