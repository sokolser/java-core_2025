package lr3.timus.task_1567;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> keypad = new HashMap<>();
        String keys = "abc def ghi jkl mno pqr stu vwx yz .,!";
        int[] costs = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 2, 3};

        int index = 0;
        for (char c : keys.toCharArray()) {
            if (c != ' ') {
                keypad.put(c, costs[index++]);
            }
        }
        keypad.put(' ', 1);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().trim();
        scanner.close();

        int cost = 0;
        for (char c : text.toCharArray()) {
            cost += keypad.getOrDefault(c, 0);
        }

        System.out.println(cost);
    }
}