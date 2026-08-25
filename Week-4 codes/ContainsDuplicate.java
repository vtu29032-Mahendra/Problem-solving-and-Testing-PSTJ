import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean duplicate = false;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (!set.add(num)) {
                duplicate = true;
            }
        }

        System.out.println(duplicate);

        sc.close();
    }
}