package lr2.timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[][] table = new int[N][N];
        int number = 1;


        for (int col = N - 1; col >= 0; col--) {
            int i = 0, j = col;
            while (j < N) {
                table[i][j] = number++;
                i++;
                j++;
            }
        }

        for (int row = 1; row < N; row++) {
            int i = row, j = 0;
            while (i < N) {
                table[i][j] = number++;
                i++;
                j++;
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
