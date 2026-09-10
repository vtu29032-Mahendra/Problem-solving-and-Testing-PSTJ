import java.util.Scanner;

class Parking {
    int big;
    int medium;
    int small;

    Parking(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            small--;
            return true;
        }

        return false;
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter big medium small slots: ");
        int big = sc.nextInt();
        int medium = sc.nextInt();
        int small = sc.nextInt();

        Parking parking = new Parking(big, medium, small);

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();

        System.out.println("Car type: 1=Big, 2=Medium, 3=Small");

        for (int i = 0; i < n; i++) {
            int carType = sc.nextInt();
            System.out.println(parking.addCar(carType));
        }

        sc.close();
    }
}