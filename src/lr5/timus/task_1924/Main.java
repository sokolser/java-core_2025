package lr5.timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("grimy");
        } else if (n % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
    }
}
