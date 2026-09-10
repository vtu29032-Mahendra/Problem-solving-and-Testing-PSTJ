import java.util.*;

public class ThroneInheritance {

    private String king;
    private Map<String, List<String>> children;
    private Set<String> dead;

    public ThroneInheritance(String kingName) {
        king = kingName;
        children = new HashMap<>();
        dead = new HashSet<>();
        children.put(king, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        children.putIfAbsent(parentName, new ArrayList<>());
        children.putIfAbsent(childName, new ArrayList<>());

        children.get(parentName).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    private void dfs(String person, List<String> order) {

        if (!dead.contains(person)) {
            order.add(person);
        }

        for (String child : children.get(person)) {
            dfs(child, order);
        }
    }

    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter king name: ");
        String king = sc.next();

        ThroneInheritance throne = new ThroneInheritance(king);

        System.out.print("Enter number of births: ");
        int n = sc.nextInt();

        System.out.println("Enter parent and child:");

        for (int i = 0; i < n; i++) {
            String parent = sc.next();
            String child = sc.next();

            throne.birth(parent, child);
        }

        System.out.print("Enter person who died (or NONE): ");
        String deadPerson = sc.next();

        if (!deadPerson.equals("NONE")) {
            throne.death(deadPerson);
        }

        System.out.println("Inheritance Order: "
                + throne.getInheritanceOrder());

        sc.close();
    }
}