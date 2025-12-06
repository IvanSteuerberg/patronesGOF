package abstractfactory;

/**
 * Implementación concreta de una Mesa de estilo Clásico.
 */
public class MesaClasica implements Mesa {
    @Override
    public void ponerCosas() {
        System.out.println("Poniendo cosas en una robusta mesa de madera clásica.");
    }

    @Override
    public String obtenerEstilo() {
        return "Clásico";
    }
}
