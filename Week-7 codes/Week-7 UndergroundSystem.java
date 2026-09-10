import java.util.HashMap;
import java.util.Scanner;

class Trip {
    String station;
    int time;

    Trip(String station, int time) {
        this.station = station;
        this.time = time;
    }
}

public class UndergroundSystem {

    HashMap<Integer, Trip> checkInMap = new HashMap<>();
    HashMap<String, Integer> totalTime = new HashMap<>();
    HashMap<String, Integer> tripCount = new HashMap<>();

    public void checkIn(int id, String station, int time) {
        checkInMap.put(id, new Trip(station, time));
    }

    public void checkOut(int id, String station, int time) {
        Trip trip = checkInMap.get(id);

        String route = trip.station + "-" + station;
        int duration = time - trip.time;

        totalTime.put(route,
                totalTime.getOrDefault(route, 0) + duration);

        tripCount.put(route,
                tripCount.getOrDefault(route, 0) + 1);

        checkInMap.remove(id);
    }

    public double getAverageTime(String start, String end) {
        String route = start + "-" + end;

        return (double) totalTime.get(route)
                / tripCount.get(route);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UndergroundSystem system = new UndergroundSystem();

        System.out.print("Enter passenger ID: ");
        int id = sc.nextInt();

        System.out.print("Enter check-in station: ");
        String start = sc.next();

        System.out.print("Enter check-in time: ");
        int startTime = sc.nextInt();

        system.checkIn(id, start, startTime);

        System.out.print("Enter check-out station: ");
        String end = sc.next();

        System.out.print("Enter check-out time: ");
        int endTime = sc.nextInt();

        system.checkOut(id, end, endTime);

        System.out.println("Average time: "
                + system.getAverageTime(start, end));

        sc.close();
    }
}