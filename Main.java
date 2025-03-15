import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void removeLowPerformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void promoteStudents(Set<Student> students) {
        students.forEach(Student::promote);
    }

    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.course == course)
                .forEach(student -> System.out.println(student.name));
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>(Arrays.asList(
                new Student("Иван", "А1", 1, Arrays.asList(3, 4, 5)),
                new Student("Мария", "B2", 2, Arrays.asList(2, 3, 2)),
                new Student("Петр", "A1", 1, Arrays.asList(5, 5, 4)),
                new Student("Анна", "C3", 3, Arrays.asList(3, 3, 3))
        ));

        System.out.println("Задание 1");
        System.out.println("Список студентов до изменений:");
        students.forEach(System.out::println);

        removeLowPerformingStudents(students);

        promoteStudents(students);

        System.out.println("\nСписок студентов после изменений:");
        students.forEach(System.out::println);

        System.out.println("\nСтуденты на втором курсе:");
        printStudents(students, 2);

        System.out.println("\nЗадание 2");
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "123-456");

        phoneDirectory.add("Петров", "234-567");

        phoneDirectory.add("Иванов", "789-012");

        phoneDirectory.add("Сидоров", "345-678");

        phoneDirectory.add("Петров", "456-789");

        System.out.println("Телефон Иванова: " + phoneDirectory.get("Иванов"));
        System.out.println("Телефон Петрова: " + phoneDirectory.get("Петров"));
        System.out.println("Телефон Сидорова: " + phoneDirectory.get("Сидоров"));
        System.out.println("Телефон Некрасова: " + phoneDirectory.get("Некрасов"));

        System.out.println("\nПолный телефонный справочник");
        phoneDirectory.printDirectory();
    }
}
