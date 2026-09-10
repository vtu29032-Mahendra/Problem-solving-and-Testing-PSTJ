import java.util.ArrayList;
import java.util.Scanner;

public class BrowserHistory {

    ArrayList<String> history = new ArrayList<>();
    int current = 0;

    public BrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {
        while (history.size() > current + 1) {
            history.remove(history.size() - 1);
        }

        history.add(url);
        current++;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }

    public String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps);
        return history.get(current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter homepage: ");
        String homepage = sc.next();

        BrowserHistory browser = new BrowserHistory(homepage);

        System.out.print("Enter number of websites to visit: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String url = sc.next();
            browser.visit(url);
        }

        System.out.print("Enter back steps: ");
        int backSteps = sc.nextInt();
        System.out.println("Current page: "
                + browser.back(backSteps));

        System.out.print("Enter forward steps: ");
        int forwardSteps = sc.nextInt();
        System.out.println("Current page: "
                + browser.forward(forwardSteps));

        sc.close();
    }
}