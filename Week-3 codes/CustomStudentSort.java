import java.util.*;

class StudentData {
    String name;
    int marks;

    StudentData(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class CustomStudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        ArrayList<StudentData> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();

            students.add(new StudentData(name, marks));
        }

        students.sort((a, b) -> {
            if (a.marks != b.marks) {
                return b.marks - a.marks;
            }

            return a.name.compareTo(b.name);
        });

        System.out.println("Students sorted by marks:");

        for (StudentData s : students) {
            System.out.println(s.name + " " + s.marks);
        }

        sc.close();
    }
}