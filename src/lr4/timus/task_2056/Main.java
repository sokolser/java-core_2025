package lr4.timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества экзаменов
        int n = scanner.nextInt();

        // Чтение оценок
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }

        // Проверка условий для стипендии
        String result = determineScholarship(grades);
        System.out.println(result);

        scanner.close();
    }

    public static String determineScholarship(int[] grades) {
        boolean hasThrees = false;
        boolean allFives = true;
        double sum = 0;


        for (int grade : grades) {
            if (grade == 3) {
                hasThrees = true;
            }
            if (grade != 5) {
                allFives = false;
            }
            sum += grade;
        }


        double average = sum / grades.length;


        if (hasThrees) {
            return "None";
        } else if (allFives) {
            return "Named";
        } else if (average >= 4.5) {
            return "High";
        } else {
            return "Common";
        }
    }
}
