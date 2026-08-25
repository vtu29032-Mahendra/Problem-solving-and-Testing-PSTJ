import java.util.Scanner;

public class BirthdayBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolate squares: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter chocolate values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter birth day value: ");
        int day = sc.nextInt();

        System.out.print("Enter birth month value: ");
        int month = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n - month; i++) {
            int sum = 0;

            for (int j = i; j < i + month; j++) {
                sum += arr[j];
            }

            if (sum == day) {
                count++;
            }
        }

        System.out.println("Number of ways: " + count);

        sc.close();
    }
}