import java.util.Scanner;

public class CompareTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aliceScore = 0;
        int bobScore = 0;

        int[] alice = new int[3];
        int[] bob = new int[3];

        System.out.println("Enter 3 values for Alice:");

        for (int i = 0; i < 3; i++) {
            alice[i] = sc.nextInt();
        }

        System.out.println("Enter 3 values for Bob:");

        for (int i = 0; i < 3; i++) {
            bob[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (alice[i] > bob[i]) {
                aliceScore++;
            } else if (alice[i] < bob[i]) {
                bobScore++;
            }
        }

        System.out.println(aliceScore + " " + bobScore);

        sc.close();
    }
}