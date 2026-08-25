import java.util.ArrayList;
import java.util.Scanner;

public class MatrixRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        System.out.print("Enter rotations: ");
        int rotations = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int layers = Math.min(rows, columns) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> values = new ArrayList<>();

            // Top row
            for (int j = layer; j < columns - layer; j++) {
                values.add(matrix[layer][j]);
            }

            // Right column
            for (int i = layer + 1; i < rows - layer; i++) {
                values.add(matrix[i][columns - layer - 1]);
            }

            // Bottom row
            for (int j = columns - layer - 2; j >= layer; j--) {
                values.add(matrix[rows - layer - 1][j]);
            }

            // Left column
            for (int i = rows - layer - 2; i > layer; i--) {
                values.add(matrix[i][layer]);
            }

            int size = values.size();
            int r = rotations % size;

            ArrayList<Integer> rotated = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                rotated.add(values.get((i + r) % size));
            }

            int index = 0;

            for (int j = layer; j < columns - layer; j++) {
                matrix[layer][j] = rotated.get(index++);
            }

            for (int i = layer + 1; i < rows - layer; i++) {
                matrix[i][columns - layer - 1] = rotated.get(index++);
            }

            for (int j = columns - layer - 2; j >= layer; j--) {
                matrix[rows - layer - 1][j] = rotated.get(index++);
            }

            for (int i = rows - layer - 2; i > layer; i--) {
                matrix[i][layer] = rotated.get(index++);
            }
        }

        System.out.println("Rotated Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}