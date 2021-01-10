package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File result1 = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day16\\result1.txt");
        File result2 = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day16\\result2.txt");

        PrintWriter pw1 = new PrintWriter(result1);

        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            pw1.println(array[i]);
        }
        pw1.close();

        PrintWriter pw2 = new PrintWriter(result2);
        Scanner scanner = new Scanner(result1);

        while (scanner.hasNextLine()) {
            double sum = 0;
            int d = 20;
            for (int i = 0; i < d; i++) {
                sum += Double.parseDouble(scanner.nextLine());
            }
            sum /= d;
            pw2.println(sum);
        }
        scanner.close();
        pw2.close();

        System.out.println(printResult(result2));
    }

    public static int printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int sum = 0;
        while (scanner.hasNextLine()){
            sum += Double.parseDouble(scanner.nextLine());
        }
        scanner.close();
        return sum;
    }
}
