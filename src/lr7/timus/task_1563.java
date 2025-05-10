package lr7.timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества магазинов
        int N = Integer.parseInt(scanner.nextLine());

        // Множество для хранения уникальных названий магазинов
        Set<String> visitedShops = new HashSet<>();
        int duplicateCount = 0; // Счетчик повторных посещений

        // Чтение и обработка названий магазинов
        for (int i = 0; i < N; i++) {
            String shopName = scanner.nextLine();

            // Если магазин уже посещен, увеличиваем счетчик
            if (visitedShops.contains(shopName)) {
                duplicateCount++;
            } else {
                visitedShops.add(shopName);
            }
        }

        // Вывод количества "БАЯН" (повторных посещений)
        System.out.println(duplicateCount);
    }
}