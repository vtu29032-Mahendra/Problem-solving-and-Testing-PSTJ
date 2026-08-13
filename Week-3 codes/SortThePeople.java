import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        Integer[] index = new Integer[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        System.out.println("People sorted by height:");

        for (int i : index) {
            System.out.println(names[i] + " " + heights[i]);
        }

        sc.close();
    }
}