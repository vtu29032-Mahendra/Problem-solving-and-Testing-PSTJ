import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix:");

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}