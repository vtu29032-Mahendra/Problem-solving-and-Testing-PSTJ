import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        num = Math.abs(num);

        System.out.print("Enter choice (even/odd): ");
        String choice = sc.next();

        int sum = 0;

        if (!choice.equalsIgnoreCase("even") && !choice.equalsIgnoreCase("odd")) {
            System.out.println("Invalid choice! Please enter 'even' or 'odd'.");
            sc.close();
            return;
        }

        while (num > 0) {
            int digit = num % 10;

            if (choice.equalsIgnoreCase("even")) {
                if (digit % 2 == 0) {
                    sum += digit;
                }
            } else {
                if (digit % 2 != 0) {
                    sum += digit;
                }
            }

            num = num / 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}