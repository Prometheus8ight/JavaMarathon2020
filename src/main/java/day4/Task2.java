package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int max = 0;
        int min = 10000;
        int zero = 0;
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        for (int x : array) {
            if (x > max)
                max = x;
        }

        for (int x : array) {
            if (x < min)
                min = x;
        }

        for (int x : array) {
            if (x % 10 == 0)
                zero++;
        }

        for (int x : array) {
            if (x % 10 == 0)
                sum += x;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(zero);
        System.out.println(sum);
    }
}
