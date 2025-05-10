package lr6.timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // Базовый случай: если полоска всего одна
        if (N == 1) {
            System.out.println(2);
            return;
        }
        // Создаем массив для динамического программирования
        // dp[i] будет хранить количество способов для i полосок
        long[] dp = new long[N + 1];
        // Базовые случаи:
        dp[1] = 2; // Для 1 полоски: Б (белая) или К (красная)
        dp[2] = 2; // Для 2 полосок: Б-К или К-Б
        // Заполняем массив dp для N >= 3
        for (int i = 3; i <= N; i++) {
            // Количество способов для i полосок равно сумме способов для:
            // 1) i-1 полосок (если добавляем Б или К)
            // 2) i-2 полосок (если добавляем С (синюю) между разными цветами)
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[N]);
    }
}