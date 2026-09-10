import java.util.Scanner;

public class JavaGenerics {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        Integer[] numbers = new Integer[n];

        System.out.println("Enter integers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number of strings: ");
        int m = sc.nextInt();

        String[] words = new String[m];

        System.out.println("Enter strings:");

        for (int i = 0; i < m; i++) {
            words[i] = sc.next();
        }

        System.out.println("Integer Array:");
        printArray(numbers);

        System.out.println("String Array:");
        printArray(words);

        sc.close();
    }
}