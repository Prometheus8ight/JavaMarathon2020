package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2020);
        car1.setColor("синий");
        car1.setModel("VW");
        System.out.println("Год выпуска автомобиля: " + car1.getYearOfIssue() + ". Цвет автомобиля: "
                + car1.getColor() + ". Модель автомобиля: " + car1.getModel() + ".");
    }

    static class Car {
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
        }
    }

