class Animal {
}

class Dog extends Animal {
}

public class InstanceofDemo {
    public static void main(String[] args) {

        Animal animal = new Dog();

        System.out.println("animal instanceof Animal: "
                + (animal instanceof Animal));

        System.out.println("animal instanceof Dog: "
                + (animal instanceof Dog));
    }
}