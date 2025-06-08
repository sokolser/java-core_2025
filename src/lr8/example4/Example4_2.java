package lr8.example4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example4_2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean tryAgain = true;

        while (tryAgain) {
            try {
                System.out.println("Введите путь к файлу (или нажмите Enter для использования пути по умолчанию):");
                String inputPath = scanner.nextLine().trim();
                String filePath = inputPath.isEmpty() ? "src/lr8/example4/example.xlsx" : inputPath;

                try (FileInputStream inputStream = new FileInputStream(filePath);
                     XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

                    XSSFSheet sheet = workbook.getSheet("Товары");
                    if (sheet == null) {
                        throw new IOException("Лист 'Товары' не найден в файле. Проверьте содержимое файла.");
                    }

                    System.out.println("\nСодержимое файла:");
                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            System.out.print(cell.toString() + "\t");
                        }
                        System.out.println();
                    }

                    tryAgain = false; // Успешное завершение - выходим из цикла

                } catch (IOException e) {
                    System.err.println("\nОшибка при чтении файла: " + e.getMessage());
                    System.err.println("Рекомендации:");
                    System.err.println("1. Проверьте существует ли файл по указанному пути: " + filePath);
                    System.err.println("2. Убедитесь, что файл не поврежден и имеет формат .xlsx");
                    System.err.println("3. Проверьте, не открыт ли файл в другой программе");
                }
            } catch (Exception e) {
                System.err.println("\nНеожиданная ошибка: " + e.getMessage());
                e.printStackTrace();
            }

            if (tryAgain) {
                System.out.println("\nХотите попробовать снова? (да/нет)");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (!answer.equals("да") && !answer.equals("y") && !answer.equals("yes")) {
                    tryAgain = false;
                }
            }
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}
