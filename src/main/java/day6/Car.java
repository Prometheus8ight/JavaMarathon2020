package day6;

public class Car {

    private int yearOfIssue;
    private String color;
    private String model;

    public void setYearOfIssue(int carYear) {
        yearOfIssue = carYear;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear){
        return inputYear - yearOfIssue;
    }
}