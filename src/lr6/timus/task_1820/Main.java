package lr6.timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Количество бифштексов
        int k = scanner.nextInt(); // Вместимость сковороды

        // Вычисляем минимальное время приготовления
        int time;
        if (n <= k) { // Если все бифштексы помещаются на сковороду за один раз, то на каждую сторону по минуте
            time = 2;
        } else {
            // Вычисляем количество полных циклов жарки
            time = (2 * n + k - 1) / k;
        }

        System.out.println(time);
    }
}