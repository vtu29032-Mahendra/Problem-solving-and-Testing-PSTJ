package ClassRoom_Tasks;

interface Sample {
    final String name = "Shree";

    void display();
}

public class ClassRoom_Task11_InterfaceConstant implements Sample {
    public void display() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        ClassRoom_Task11_InterfaceConstant t = new ClassRoom_Task11_InterfaceConstant();
        t.display();
        System.out.println(name);
    }
}
