package facade;

/**
 * Parte del subsistema complejo.
 * Se encarga de la gestión de la energía del vehículo.
 */
public class SistemaElectrico {
    public void suministrarEnergia() {
        System.out.println("Sistema Eléctrico: Suministrando energía...");
    }

    public void apagar() {
        System.out.println("Sistema Eléctrico: Apagando energía.");
    }
}
