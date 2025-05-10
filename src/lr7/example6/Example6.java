package lr7.example6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос пути к файлу
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine().trim();

        File file = new File(filePath);

        // Проверка файла
        if (!file.exists() || !file.isFile()) {
            System.out.println("Ошибка: файл не существует или это не файл");
            scanner.close();
            return;
        }

        // Запрос слова для поиска
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine().trim();

        System.out.println("\nРезультаты поиска:");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            int matchesCount = 0;

            // Построчное чтение файла
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.printf("%s%n", line);
                    matchesCount++;
                }
                lineNumber++;
            }

            System.out.println("Общий размер файла: " + file.length() + " байт");

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
