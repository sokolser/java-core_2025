package lr7.timus;

import java.util.*;

public class task_1496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества сабмитов
        int N = scanner.nextInt();
        scanner.nextLine(); // Пропускаем оставшуюся часть строки

        // Создаем словарь для подсчета количества сабмитов от каждой команды
        Map<String, Integer> submissionCount = new HashMap<>();

        // Чтение и обработка N сабмитов
        for (int i = 0; i < N; i++) {
            String teamName = scanner.nextLine();
            // Увеличиваем счетчик для текущей команды
            submissionCount.put(teamName, submissionCount.getOrDefault(teamName, 0) + 1);
        }

        // Собираем имена команд с более чем одним сабмитом
        List<String> spammers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : submissionCount.entrySet()) {
            if (entry.getValue() > 1) {
                spammers.add(entry.getKey());
            }
        }

        // Вывод результатов
        for (String spammer : spammers) {
            System.out.println(spammer);
        }
    }
}