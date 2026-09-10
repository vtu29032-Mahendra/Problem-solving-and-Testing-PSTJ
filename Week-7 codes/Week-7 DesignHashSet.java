import java.util.HashSet;
import java.util.Scanner;

public class DesignHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("HashSet: " + set);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        System.out.println("Contains " + search + ": "
                + set.contains(search));

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();

        set.remove(remove);

        System.out.println("After removing: " + set);

        sc.close();
    }
}