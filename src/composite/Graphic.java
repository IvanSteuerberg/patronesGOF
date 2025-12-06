package composite;

/**
 * La interfaz Componente.
 * Declara operaciones comunes tanto para los objetos simples (hojas)
 * como para los complejos (compuestos) de una composición.
 */
public interface Graphic {
    /**
     * Dibuja el gráfico en la pantalla.
     * Una hoja simple se dibujará a sí misma.
     * Un objeto compuesto delegará la operación a sus hijos.
     */
    void draw();
}
