package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2010);
        car1.setColor("blue");
        car1.setModel("VW");
        Moto moto1 = new Moto(2018, "blue", "Yamaha");
        System.out.println(car1.yearDifference(2005));
        System.out.println(moto1.yearDifference(1300));
    }
}