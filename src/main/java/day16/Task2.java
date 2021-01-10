package day16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File example = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day16\\example.txt");
        example.createNewFile();
        PrintWriter pw = new PrintWriter(example);
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.print(array[i] + " ");
            pw.print(array[i] + " ");
        }
    }
}