package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {

        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после разделения : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        String substring = "список";
        List<String> stringsAfter = filterSubstring(strings, substring);

        System.out.println("\n" + "Строки содержащие подстроку \"" + substring + "\" : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterSubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
