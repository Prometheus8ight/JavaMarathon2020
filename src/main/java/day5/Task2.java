package day5;


public class Task2 {
    public static void main(String[] args) {
        Moto moto1 = new Moto(2020, "красный", "Yamaha");
        System.out.println("Год выпуска мотоцикла: " + moto1.yearOfIssue + ". " + "Цвет мотоцикла: "
                + moto1.color + ". Модель мотоцикла: " + moto1.model + ".");
    }

    static class Moto {
        private int yearOfIssue;
        private String color;
        private String model;

        public Moto(int yearOfIssue, String color, String model) {
            this.yearOfIssue = yearOfIssue;
            this.color = color;
            this.model = model;
        }
    }
}