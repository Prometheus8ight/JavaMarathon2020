package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileNumbers = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day14\\numbers.txt");
        System.out.println(printSumDigits(fileNumbers));
    }

    public static Object printSumDigits(File file) {
        int sum = 0;
        try {
          Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if(numbersString.length != 10)
                throw new IllegalArgumentException();

            for(String number : numbersString){
                Integer.parseInt(number);
                sum += Integer.parseInt(number);
            }
            return sum;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Элементов меньше, чем 10!");
        }
        return null;
        }
}
