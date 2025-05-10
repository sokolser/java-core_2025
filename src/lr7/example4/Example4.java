package lr7.example4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/lr7/example4/input.txt");
             FileWriter writer = new FileWriter("src/lr7/example4/output.txt")) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            System.out.println("Файл скопирован успешно!");
        } catch (IOException e) {
            System.err.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}
