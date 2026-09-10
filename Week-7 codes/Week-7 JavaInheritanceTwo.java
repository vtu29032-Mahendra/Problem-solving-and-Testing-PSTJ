import java.util.Scanner;

class Arithmetic {

    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class JavaInheritanceTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Adder adder = new Adder();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("My superclass is: "
                + adder.getClass().getSuperclass().getName());

        System.out.println(a + " + " + b + " = "
                + adder.add(a, b));

        sc.close();
    }
}