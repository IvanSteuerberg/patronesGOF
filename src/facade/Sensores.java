package facade;

/**
 * Parte del subsistema complejo.
 * Se encarga de comprobar el estado del vehículo.
 */
public class Sensores {
    public void comprobarPresionNeumaticos() {
        System.out.println("Sensores: Presión de neumáticos OK.");
    }

    public void comprobarNivelAceite() {
        System.out.println("Sensores: Nivel de aceite OK.");
    }

    public void apagar() {
        System.out.println("Sensores: Desactivados.");
    }
}
