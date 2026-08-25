import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();
            String first;
            String second;

            if (n % 2 == 0) {
                first = s.substring(0, n / 2);
                second = s.substring(n / 2);
            } else {
                first = s.substring(0, n / 2);
                second = s.substring(n / 2 + 1);
            }

            char[] a = first.toCharArray();
            char[] b = second.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}