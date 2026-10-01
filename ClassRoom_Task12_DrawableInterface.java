package ClassRoom_Tasks;

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

public class ClassRoom_Task12_DrawableInterface {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
