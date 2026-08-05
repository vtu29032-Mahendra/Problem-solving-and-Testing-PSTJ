import java.util.*;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }

        System.out.println("Output:");
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}