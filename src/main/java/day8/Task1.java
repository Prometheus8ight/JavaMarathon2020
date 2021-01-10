package day8;


public class Task1 {
    public static void main(String[] args) {

        long before = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20001; i++)
            sb.append(i).append(" ");

        long after = System.currentTimeMillis();

        System.out.print(sb);
        System.out.println("Время выполнения цикла с классом StringBuilder: " + (after - before));

        before = System.currentTimeMillis();

        String n = "";
        for (int j = 0; j < 20001; j++) {
            n += j + " ";

        }
        after = System.currentTimeMillis();
        System.out.print(n);
        System.out.println("Время выполнения цикла с классом String: " + (after - before));

    }
}








