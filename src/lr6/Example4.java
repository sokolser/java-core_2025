package lr6;

import java.time.LocalTime;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Поток №: " + i);
            }
        });

        t.start();
        t.join();
    }
}
