package lr5;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {

    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки," +
                "которые содержат только буквы (без цифр и символов)";


        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterLen(strings);

        System.out.println("\n" + "Строки без символов "+ "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterLen(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-я]+"))
                .collect(Collectors.toList());
    }
}
