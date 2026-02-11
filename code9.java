import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class code9 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ravi", 80));
        students.add(new Student("Anu", 95));
        students.add(new Student("John", 70));

        // Sorting using Comparator (by marks - ascending)
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        });

        // Print sorted list
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
