import java.util.*;

public class FindHighestAltitude{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of gains: ");

        int n=sc.nextInt();

        int[] gain=new int[n];

        System.out.println("Enter gains:");

        for(int i=0;i<n;i++)
            gain[i]=sc.nextInt();

        int altitude=0;
        int max=0;

        for(int i=0;i<n;i++){
            altitude+=gain[i];
            if(altitude>max)
                max=altitude;
        }

        System.out.println("Highest Altitude = "+max);

        sc.close();
    }
}