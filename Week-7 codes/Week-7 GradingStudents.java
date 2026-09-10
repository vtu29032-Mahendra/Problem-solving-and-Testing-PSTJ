import java.util.Scanner;

public class GradingStudents {

    public static int gradeStudent(int grade) {

        if (grade < 38) {
            return grade;
        }

        int nextMultiple = ((grade / 5) + 1) * 5;

        if (nextMultiple - grade < 3) {
            return nextMultiple;
        }

        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Enter grades:");

        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();

            System.out.println("Final grade: "
                    + gradeStudent(grade));
        }

        sc.close();
    }
}