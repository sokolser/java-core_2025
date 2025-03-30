package lr3.Example1;

public class Example1_5 {
    public static void main(String[] args) {
        System.out.println("Факториал 5: " + fact(5));
    }

    public static int fact(int n) {
        System.out.println("Вызов fact(" + n + ")");
        if (n == 0) {
            System.out.println("Возвращение fact(0): 0");
            return 0;
        } else if (n == 1) {
            System.out.println("Возвращение fact(1): 1");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Возвращение fact(" + n + "): " + result);
            return result;
        }
    }
}
