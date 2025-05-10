package lr7.example3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("src/lr7/example3/input.txt"));

        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }

        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}
