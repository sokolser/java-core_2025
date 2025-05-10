package lr7.example7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите название файла для записи: ");
        String fileName = scanner.nextLine();

        // Проверка расширения файла
        if (!fileName.contains(".")) {
            fileName += ".txt";
        }


        System.out.print("Введите текст для записи в файл: ");
        String text = scanner.nextLine();


        File file = new File(fileName);

        // Запись в файл и подсчет символов
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
            int charCount = text.length();

            System.out.println("\nФайл успешно сохранен:");
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + charCount + " символов");

        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    }
}