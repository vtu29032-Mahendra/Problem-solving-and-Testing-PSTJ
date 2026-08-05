import java.util.*;

public class TopKFrequentElements{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");

        int n=sc.nextInt();

        int[] nums=new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();

        System.out.print("Enter k: ");

        int k=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((a,b)->b.getValue()-a.getValue());

        System.out.println("Top "+k+" Frequent Elements:");

        for(int i=0;i<k;i++){
            System.out.print(list.get(i).getKey()+" ");
        }

        sc.close();
    }
}