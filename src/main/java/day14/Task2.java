package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    File file = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day14\\people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        List<String> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
               String people =  scanner.nextLine();
                String[] split = people.split(" ");

               if(Integer.parseInt(split[1]) < 0)
                   throw new IllegalArgumentException();

                data.add(people);
            }
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }catch (IllegalArgumentException e){
            System.out.println("Возраст ниже 0!");
        }
        return null;
    }

}
