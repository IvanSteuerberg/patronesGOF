package composite;

/**
 * La clase Hoja (Leaf).
 * Representa un objeto simple en la composición. No puede tener hijos.
 */
public class Dot implements Graphic {
    protected int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un punto en (" + x + ", " + y + ")");
    }
}
