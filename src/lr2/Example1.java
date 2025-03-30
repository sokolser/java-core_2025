package lr2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
        int minValue = nums[0];
        StringBuilder minIndexes = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > minValue) {
                break;
            }
            minIndexes.append(i).append(" ");
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Индексы минимальных значений: " + minIndexes);
    }
}
