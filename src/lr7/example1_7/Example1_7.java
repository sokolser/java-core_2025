package lr7.example1_7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ручной ввод данных
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        Person person = new Person(name, age);

        // Запись в JSON-формат
        try (FileWriter fileWriter = new FileWriter("src/lr7/example1_7/person.json")) {
            String json = String.format(
                    "{\n  \"name\": \"%s\",\n  \"age\": %d\n}",
                    person.getName(), person.getAge()
            );

            fileWriter.write(json);
            System.out.println("Данные сохранены в person.json");
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}