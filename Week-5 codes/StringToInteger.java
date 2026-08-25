import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int i = 0;
        int sign = 1;
        long result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() &&
               Character.isDigit(s.charAt(i))) {

            result = result * 10 + (s.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
                break;
            }

            if (sign == -1 && -result < Integer.MIN_VALUE) {
                result = -(long) Integer.MIN_VALUE;
                break;
            }

            i++;
        }

        System.out.println("Integer value: " + sign * result);

        sc.close();
    }
}