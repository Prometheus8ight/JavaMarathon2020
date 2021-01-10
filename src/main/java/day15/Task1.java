package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        System.out.println(parseFileToStringList(file));
    }

    public static File parseFileToStringList(File file) {
        File missingShoes = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day15\\missingShoes.txt");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(missingShoes);

            while (scanner.hasNextLine()) {
                String[] lineIn = scanner.nextLine().split(";");
                if (Integer.parseInt(lineIn[2]) == 0) {
                    pw.println(lineIn[0] + ", " + lineIn[1] + ", " + lineIn[2]);
                }
            }
            pw.close();
            scanner.close();
            return missingShoes;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        return null;
    }
}