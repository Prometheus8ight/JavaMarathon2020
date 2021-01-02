package day8;


public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 20001; i++)
            sb = sb.append(i).append(" ");

        for (int j = 1; j < 20001; j++) {
            String n = j + " ";
            System.out.print(n);
        }
        System.out.print(sb);
        System.out.println("");
        System.out.println("cold start time " + String.format("%,12d", measure()) + " ns");
        System.out.println("warmed JRE time " + String.format("%,12d", measure()) + " ns");
    }

    private static long measure() {
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ;
        }
        en = System.nanoTime();
        return en - st;
    }
}











