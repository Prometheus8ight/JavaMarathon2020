package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

        public class Task1 {
            public static void main(String[] args) {
                File fileIn = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day14\\numbers.txt");
                System.out.println(printResult(fileIn));
            }

            public static File printResult(File file) {
                File result = new File("D:\\Programming\\JavaProjects\\JavaMarathon2020\\src\\main\\java\\day16\\result.txt");
                double sum = 0;
                int count = 0;
                DecimalFormat dF = new DecimalFormat( "#.###" );

                try {
                    Scanner scanner = new Scanner(file);
                    PrintWriter pw = new PrintWriter(result);

                    while (scanner.hasNextLine()) {
                        String[] lineIn = scanner.nextLine().split(" ");

                        for (String number : lineIn) {
                            sum += Double.parseDouble(number);
                            count++;
                        }
                        double value = sum / count;
                        pw.println(value + " --> " + dF.format(value));
                    }
                    pw.close();
                    scanner.close();
                    return result;
                } catch (FileNotFoundException e) {
                    System.out.println("Файл не найден!");
                }
                return null;

            }
        }

