import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lists: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                list.add(sc.nextInt());
            }

            lists.add(list);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x >= 1 && x <= n && y >= 1 && y <= lists.get(x - 1).size()) {
                System.out.println(lists.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}