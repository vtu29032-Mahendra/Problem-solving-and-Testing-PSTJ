import java.util.Scanner;

public class MaximumCircularSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int total = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int currentMax = arr[0];
        int maxSum = arr[0];

        int currentMin = arr[0];
        int minSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);
        }

        int result;

        if (maxSum < 0) {
            result = maxSum;
        } else {
            result = Math.max(maxSum, total - minSum);
        }

        System.out.println("Maximum Circular Subarray Sum: " + result);

        sc.close();
    }
}