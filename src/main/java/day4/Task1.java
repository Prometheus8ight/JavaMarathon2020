package day4;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayIn = scanner.nextInt();

        int c8 = 0;
        int c1 = 0;
        int cEven = 0;
        int cOdd = 0;
        int sum = 0;

        int[] array = new int[arrayIn];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10));
            System.out.print(array[i] + " ");

            if (array[i] > 8) {
                c8++;
            }

            if (array[i] == 1) {
                c1++;
            }

            if (array[i] % 2 == 0 && array[i] != 0) {
                cEven++;
            }

            else {
                cOdd++;
            }

            sum += array[i];

        }
        System.out.println("");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + c8);
        System.out.println("Количество чисел равных 1: " + c1);
        System.out.println("Количество чётных чисел: " + cEven);
        System.out.println("Количество нечётных чисел: " + cOdd);
        System.out.print("Сумма всех элементов массива: " + sum);
    }
}
