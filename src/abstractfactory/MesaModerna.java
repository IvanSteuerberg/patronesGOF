package abstractfactory;

/**
 * Implementación concreta de una Mesa de estilo Moderno.
 */
public class MesaModerna implements Mesa {
    @Override
    public void ponerCosas() {
        System.out.println("Poniendo cosas en una mesa de diseño moderno.");
    }

    @Override
    public String obtenerEstilo() {
        return "Moderno";
    }
}
