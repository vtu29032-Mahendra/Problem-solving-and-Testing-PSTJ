import java.util.Scanner;

public class SumLastDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Get the last digit (works for positive and negative numbers)
        int last1 = Math.abs(a % 10);
        int last2 = Math.abs(b % 10);

        int sum = last1 + last2;

        System.out.println("Sum of last digits = " + sum);

        sc.close();
    }
}
