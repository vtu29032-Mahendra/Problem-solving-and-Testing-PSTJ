import java.util.Scanner;

public class StringMatchingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.println("Matching strings:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i != j && words[j].contains(words[i])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }

        sc.close();
    }
}