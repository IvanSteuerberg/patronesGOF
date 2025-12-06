package composite;

/**
 * Otra clase Hoja (Leaf).
 * Representa otro tipo de objeto simple.
 */
public class Circle extends Dot {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un círculo en (" + x + ", " + y + ") con radio " + radius);
    }
}
