package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2010);
        car1.setColor("blue");
        car1.setModel("VW");
        System.out.println(car1.yearDifference(2020));
    }
}