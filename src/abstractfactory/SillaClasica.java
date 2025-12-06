package abstractfactory;

/**
 * Implementación concreta de una Silla de estilo Clásico.
 */
public class SillaClasica implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Sentándose en una silla clásica. ¡Qué elegancia!");
    }

    @Override
    public boolean tienePatas() {
        return true;
    }
}
