import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2*n];

        System.out.println("Enter array:");
        for(int i=0;i<2*n;i++){
            nums[i]=sc.nextInt();
        }

        int[] ans = new int[2*n];
        int index=0;

        for(int i=0;i<n;i++){
            ans[index++]=nums[i];
            ans[index++]=nums[i+n];
        }

        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}