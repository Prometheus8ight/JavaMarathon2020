package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(String student) {
        Random random = new Random();
        int grade = 2 + random.nextInt(4);
        if (grade == 2) {
            System.out.println("Преподаватель " + name + " оценил студента с именем "
                    + student + " по предмету " + subject + " на оценку: неудовлетворительно.");
        } else if (grade == 3) {
            System.out.println("Преподаватель " + name + " оценил студента с именем "
                    + student + " по предмету " + subject + " на оценку: удовлетворительно.");
        } else if (grade == 4) {
            System.out.println("Преподаватель " + name + " оценил студента с именем "
                    + student + " по предмету " + subject + " на оценку: хорошо.");
        } else {
            System.out.println("Преподаватель " + name + " оценил студента с именем "
                    + student + " по предмету " + subject + " на оценку: отлично. ");
        }
    }
}
