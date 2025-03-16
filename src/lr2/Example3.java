package lr2;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования" + Arrays.toString(chars));

        for(int i = 0; i < chars.length; i ++){
            ints[i] = chars[i] + key;
        }

        System.out.println("ints до преобразования" + Arrays.toString(ints));

        for(int i = 0; i < chars.length; i ++){
            chars[i] = (char) ints[i];
        }

        System.out.println("chars после преобразования" + Arrays.toString(chars));

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String response = in.next().trim().toLowerCase();

            if (response.equals("y")) {
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = (char) (chars[i] - key);
                }
                System.out.println("Текст после обратного преобразования: " + new String(chars));
                break;
            } else if (response.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
