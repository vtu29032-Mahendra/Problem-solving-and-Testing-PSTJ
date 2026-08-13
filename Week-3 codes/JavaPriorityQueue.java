import java.util.*;

class Student {
    String name;
    double cgpa;
    int id;

    Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Student> pq = new PriorityQueue<>(
            (a, b) -> {
                if (Double.compare(b.cgpa, a.cgpa) != 0)
                    return Double.compare(b.cgpa, a.cgpa);

                int nameCompare = a.name.compareTo(b.name);

                if (nameCompare != 0)
                    return nameCompare;

                return Integer.compare(a.id, b.id);
            }
        );

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equals("ENTER")) {
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();

                pq.add(new Student(name, cgpa, id));
            } 
            else if (command.equals("SERVED")) {
                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.println("Students remaining:");

            while (!pq.isEmpty()) {
                Student s = pq.poll();
                System.out.println(s.name + " " + s.cgpa + " " + s.id);
            }
        }

        sc.close();
    }
}