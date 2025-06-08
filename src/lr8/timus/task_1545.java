package lr8.timus;

import java.util.Scanner;
import java.util.ArrayList;

public class task_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Переход на следующую строку после числа

        ArrayList<String> hieroglyphs = new ArrayList<>();

        // Считываем N иероглифов
        for (int i = 0; i < N; i++) {
            String hieroglyph = scanner.nextLine();
            hieroglyphs.add(hieroglyph);
        }

        // Считываем введённую букву
        String inputLetter = scanner.nextLine();

        // Проверяем каждый иероглиф и выводим подходящие
        for (String hieroglyph : hieroglyphs) {
            if (hieroglyph.startsWith(inputLetter)) {
                System.out.println(hieroglyph);
            }
        }
    }
}