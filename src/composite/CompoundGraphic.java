package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Compuesto (Composite).
 * Representa un objeto complejo que puede tener hijos.
 * Los hijos pueden ser Hojas (Leaf) u otros Compuestos (Composite).
 */
public class CompoundGraphic implements Graphic {
    // Lista de gráficos hijos.
    private List<Graphic> children = new ArrayList<>();

    /**
     * Añade un gráfico a la composición.
     * @param child El gráfico a añadir (puede ser una hoja o un compuesto).
     */
    public void add(Graphic child) {
        children.add(child);
    }

    /**
     * Elimina un gráfico de la composición.
     * @param child El gráfico a eliminar.
     */
    public void remove(Graphic child) {
        children.remove(child);
    }

    /**
     * Dibuja el gráfico compuesto.
     * Esta operación se delega a todos los hijos de la composición.
     * El cliente no necesita saber si está tratando con una hoja o un compuesto.
     */
    @Override
    public void draw() {
        System.out.println("Dibujando un gráfico compuesto:");
        for (Graphic child : children) {
            child.draw(); // Llama a draw() en cada hijo, sea hoja o compuesto.
        }
        System.out.println("Fin del gráfico compuesto.");
    }
}
