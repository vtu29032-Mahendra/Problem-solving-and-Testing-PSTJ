import java.util.Scanner;

public class NaivePatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        boolean found = false;

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j;

            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == pattern.length()) {
                System.out.println("Pattern found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found");
        }

        sc.close();
    }
}
