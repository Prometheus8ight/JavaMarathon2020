package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList(){
        File file = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day14\\Person.java");
        List<Person> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String people =  scanner.nextLine();
                String[] split = people.split(" ");

                if(Integer.parseInt(split[1]) < 0)
                    throw new IllegalArgumentException();

                Person personIn = new Person(split[0], Integer.parseInt(split[1]));
                data.add(personIn);
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
