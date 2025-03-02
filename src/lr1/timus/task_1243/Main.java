package lr1.timus.task_1243;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество вещей: ");
        long N = in.nextLong();


        long things = N % 7;

        System.out.println("Количество вещей, которые достанутся Белоснежке: " + things);
        in.close();
    }
}
