package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        for (int x : array) {
            if (x > max)
                max = x;
        }

        int min = 10000;
        for (int x : array) {
            if (x < min)
                min = x;
        }

        int sum = 0;
        int zero = 0;
        for (int x : array) {
            if (x % 10 == 0)
                zero++;
                sum += x;
        }


        System.out.println(max + " " + min + " " + zero + " " + sum);
    }
}
