import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int a = 0, b = 1, c;

        if (n == 1) {
            System.out.println("Nth Fibonacci = " + a);
        } else if (n == 2) {
            System.out.println("Nth Fibonacci = " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci = " + b);
        }

        sc.close();
    }
}
