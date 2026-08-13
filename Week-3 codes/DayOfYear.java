import java.util.Scanner;
import java.time.LocalDate;

public class DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        System.out.println("Day of the year: " + date.getDayOfYear());

        sc.close();
    }
}