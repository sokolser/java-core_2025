package lr3.Example1;

public class Example1_2 {
    public static void m(int x) {
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        m(1);
    }

}
