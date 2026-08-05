import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();

        System.out.print("Enter value to remove: ");
        int val=sc.nextInt();

        int k=0;

        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }

        System.out.println("New Length = "+k);

        for(int i=0;i<k;i++)
            System.out.print(nums[i]+" ");

        sc.close();
    }
}