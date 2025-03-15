import java.util.List;

public class Student {

    String name;

    String group;

    int course;

    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public void promote() {
        if (getAverageGrade() >= 3) {
            course++;
        }
    }

    public String toString() {
        return name + " (группа: " + group + ", курс: " + course + ", средний бал: " + getAverageGrade() + ")";
    }
}
