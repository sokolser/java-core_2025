package lr8.example4;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example4_1 {
    public static void main(String[] args) {
        boolean success = false;
        while (!success) {
            try {
                // Создаем новую книгу Excel
                XSSFWorkbook workbook = new XSSFWorkbook();

                // Создаем новый лист в книге
                XSSFSheet sheet = workbook.createSheet("Товары");

                // Записываем данные в ячейки
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("Товар");
                headerRow.createCell(1).setCellValue("Характеристики");
                headerRow.createCell(2).setCellValue("Стоимость");

                Row dataRow1 = sheet.createRow(1);
                dataRow1.createCell(0).setCellValue("Книга");
                dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
                dataRow1.createCell(2).setCellValue(580.0);

                Row dataRow2 = sheet.createRow(2);
                dataRow2.createCell(0).setCellValue("Компьютер");
                dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 16GB");
                dataRow2.createCell(2).setCellValue(25000.0);

                // Записываем книгу Excel в файл
                String filePath = "src/lr8/example4/example.xlsx";
                try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                    workbook.write(outputStream);
                    System.out.println("Данные успешно записаны в файл: " + filePath);
                    success = true;
                } catch (IOException e) {
                    System.err.println("Ошибка при записи файла: " + e.getMessage());
                    System.err.println("Проверьте:");
                    System.err.println("1. Существует ли директория src/lr8/example4/");
                    System.err.println("2. Есть ли права на запись в этой директории");
                    System.err.println("3. Не открыт ли файл в другой программе");
                } finally {
                    workbook.close();
                }
            } catch (Exception e) {
                System.err.println("Неожиданная ошибка при создании Excel файла: " + e.getMessage());
                e.printStackTrace();
                break;
            }
        }
    }
}