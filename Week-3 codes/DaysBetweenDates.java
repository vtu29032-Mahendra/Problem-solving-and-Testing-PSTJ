import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        String date1 = sc.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String date2 = sc.nextLine();

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        long days = Math.abs(ChronoUnit.DAYS.between(d1, d2));

        System.out.println("Number of days: " + days);

        sc.close();
    }
}