package lr3;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap 10 объектами
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "apple");
        map.put(1, "banana");
        map.put(2, "cherry");
        map.put(3, "date");
        map.put(4, "elderberry");
        map.put(5, "fig");
        map.put(6, "grape");
        map.put(7, "honeydew");
        map.put(8, "imbe");
        map.put(9, "jackfruit");

        // Находим строки, у которых ключ > 5
        System.out.println("Strings with keys greater than 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Если ключ = 0, выводим строки через запятую
        if (map.containsKey(0)) {
            System.out.println("Strings with key 0:");
            System.out.println(map.get(0));
        }

        // Перемножаем все ключи, где длина строки > 5
        long product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        if (found) {
            System.out.println("Product of keys where string length > 5:");
            System.out.println(product);
        } else {
            System.out.println("No strings with length > 5 found.");
        }
    }

}
