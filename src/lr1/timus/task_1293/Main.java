package lr1.timus.task_1293;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();


        int totalArea = (N * (A * B)) * 2;

        System.out.println(totalArea);
        in.close();
    }
}
