package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("The Boeing Company", 2012, 100, 2000, 0);
        boeing.info();
        boeing.setYear(2014);
        boeing.setLength(120);
        boeing.fillUp(3000);
        boeing.info();
    }
}
