import java.util.*;

public class FindReplacePattern {

    public static boolean matches(String word, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = pattern.charAt(i);

            if (map1.containsKey(a) && map1.get(a) != b) {
                return false;
            }

            if (map2.containsKey(b) && map2.get(b) != a) {
                return false;
            }

            map1.put(a, b);
            map2.put(b, a);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        System.out.println("Matching words:");

        for (String word : words) {
            if (matches(word, pattern)) {
                System.out.println(word);
            }
        }

        sc.close();
    }
}