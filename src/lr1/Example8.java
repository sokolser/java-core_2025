package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели: ");
        String dayofweek = in.nextLine();

        System.out.println("Введите текущую дату: ");
        String dayofmonth = in.nextLine();

        System.out.println("Введите текущий месяц: ");
        String month = in.nextLine();

        System.out.println("Сегодня " + " " + dayofweek + " " + dayofmonth + " " + month);
        in.close();
    }
}
