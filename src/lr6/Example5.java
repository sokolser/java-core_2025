package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example5 {

    public static void main(String[] args) throws InterruptedException {
        // Создаем массив случайных чисел
        int[] array = randomarray(10, 0, 100);

        System.out.println("Массив чиесл:");
        System.out.println(Arrays.toString(array));

        int max = findMax(array);
        System.out.println("\nМаксимальный элемент: " + max);
    }

    // Генерация массива случайных чисел
    public static int[] randomarray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Поиск максимума с использованием многопоточности
    public static int findMax(int[] array) throws InterruptedException {
        int numthreads = Runtime.getRuntime().availableProcessors();
        int potok = (array.length + numthreads - 1) / numthreads;

        int[] partialMaxes = new int[numthreads];
        Arrays.fill(partialMaxes, Integer.MIN_VALUE);

        Thread[] threads = new Thread[numthreads];

        for (int i = 0; i < numthreads; i++) {
            final int index = i;
            final int start = index * potok;
            final int end = Math.min(start + potok, array.length);

            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                partialMaxes[index] = localMax;
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int globalMax = Integer.MIN_VALUE;
        for (int max : partialMaxes) {
            if (max > globalMax) {
                globalMax = max;
            }
        }

        return globalMax;
    }
}