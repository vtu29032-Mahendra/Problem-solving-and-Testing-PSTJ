import java.util.Scanner;
import java.time.LocalDate;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        System.out.println("Day: " + date.getDayOfWeek());

        sc.close();
    }
}