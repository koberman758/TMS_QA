package HW2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alex", "G1", 10);
        Student student2 = new Student("Tom", "G2", 6);
        Student student3 = new Student("Ben", "G3", 4);
        Student student4 = new Student("Jan", "G4", 7);
        Student student5 = new Student("Bob", "G5", 3);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя студента");
        String name = scanner.next();

        for (Student student : students) {
            if (student.getName() != null && student.getName().equals(name)) {
                System.out.println(student.getGroup() + " " + student.getMark());
                return;
            }

        }

    }
}
