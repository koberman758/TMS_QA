package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", "1", 5);
        Student student2 = new Student("Bob", "2", 6);
        Student student3 = new Student("Tom", "3", 8);
        Student student4 = new Student("Serg", "1", 4);
        Student student5 = new Student("Kate", "2", 9);
        Student student6 = new Student("Jane", "3", 2);
        List<Student> students = List.of(student1, student2, student3, student4, student5, student6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя студента");
        String name = scanner.next();

        students.stream()
                .filter(student -> student.getMark() > 4)
                .sorted(Comparator.comparing(Student::getGroup))
                .forEach(System.out::println);
    }
}
