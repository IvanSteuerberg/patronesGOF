package abstractfactory;

/**
 * Implementación concreta de una Silla de estilo Moderno.
 */
public class SillaModerna implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Sentándose en una silla moderna. ¡Qué minimalista!");
    }

    @Override
    public boolean tienePatas() {
        return false; // Las sillas modernas a veces flotan ;)
    }
}
