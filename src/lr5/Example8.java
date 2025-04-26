package lr5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает только те строки, которые имеют длину больше заданного знаечниея";


        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите длину строки: ");
        int len = in.nextInt();
        List<String> stringsAfter = filterLen(strings, len);

        System.out.println("\n" + "Строки, имеющие длину больше " + len + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterLen(List<String> list, int len) {
        return list.stream()
                .filter(s -> s.length() > len)
                .collect(Collectors.toList());
    }
}
