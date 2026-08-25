import java.util.Scanner;

public class MatrixBlockSum {

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

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                int sum = 0;

                for (int r = Math.max(0, i - k);
                     r <= Math.min(rows - 1, i + k); r++) {

                    for (int c = Math.max(0, j - k);
                         c <= Math.min(columns - 1, j + k); c++) {

                        sum += matrix[r][c];
                    }
                }

                result[i][j] = sum;
            }
        }

        System.out.println("Matrix Block Sum:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}