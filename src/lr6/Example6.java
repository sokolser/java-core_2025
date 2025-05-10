package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example6 {

    public static void main(String[] args) throws InterruptedException {

        int[] array = randomarray(10, 0, 100);

        System.out.println("Массив чисел");
        System.out.println(Arrays.toString(array));

        int sum = parallelSum(array);
        System.out.println("\nСумма элементов: " + sum);
    }

    // Генерация случайного массива
    public static int[] randomarray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Многопоточное суммирование
    public static int parallelSum(int[] array) throws InterruptedException {
        int numthreads = Runtime.getRuntime().availableProcessors();
        int potok = (array.length + numthreads - 1) / numthreads;

        // Массив для хранения частичных сумм
        int[] partialSums = new int[numthreads];

        Thread[] threads = new Thread[numthreads];

        for (int i = 0; i < numthreads; i++) {
            final int id = i;
            final int start = id * potok;
            final int end = Math.min(start + potok, array.length);

            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                partialSums[id] = localSum; // Сохраняем результат потока
            });

            threads[i].start();
        }

        // Ожидаем завершения всех потоков
        for (Thread thread : threads) {
            thread.join();
        }

        // Суммируем все частичные результаты
        int totalSum = 0;
        for (int sum : partialSums) {
            totalSum += sum;
        }

        return totalSum;
    }
}