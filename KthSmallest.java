import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid value of K.");
            sc.close();
            return;
        }

        Arrays.sort(arr);

        System.out.println(k + "th Smallest Element = " + arr[k - 1]);

        sc.close();
    }
}