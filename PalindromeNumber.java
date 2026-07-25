import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers are not palindrome.");
            sc.close();
            return;
        }

        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}