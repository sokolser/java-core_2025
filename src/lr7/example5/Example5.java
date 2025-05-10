package lr7.example5;

import java.io.File;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine().trim();

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSize = file.length();
            System.out.println("Размер файла: " + fileSize + " байт");
        } else {
            System.out.println("Ошибка: файл не существует или это не файл");
        }
    }
}
