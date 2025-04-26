package lr5.timus.task_1327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int С = (B - A + 1 + (A % 2)) / 2;

        System.out.println(С);
    }
}
