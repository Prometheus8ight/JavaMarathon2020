package day6;


public class Task3 {
    public static void main(String[] args) {
    Teacher teacher = new Teacher("Марфа Васильевна", "математика");
    Student student = new Student("Борат");
    Student student1 = new Student("Свят");
    teacher.evaluate(student1);
    }
}
