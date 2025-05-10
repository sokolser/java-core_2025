package lr7.example8;

import java.io.*;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Имя: ");
        String name = scanner.nextLine();

        System.out.print("Возраст: ");
        int age = scanner.nextInt();

        // 1. Создание объекта
        Person person = new Person(name, age);
        String filename = "person.dat";

        // 2. Сериализация (бинарная запись)
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {

            oos.writeObject(person);
            System.out.println("\nОбъект сохранен в файл: " + filename);

        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // 3. Десериализация (бинарное чтение)
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {

            Person restoredPerson = (Person) ois.readObject();

            // 4. Вывод восстановленных данных
            System.out.println("\nСодержимое файла:");
            System.out.println("Имя: " + restoredPerson.getName());
            System.out.println("Возраст: " + restoredPerson.getAge());

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}