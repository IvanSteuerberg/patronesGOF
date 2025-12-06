package decorator;

/**
 * El Componente Concreto.
 * Es la clase del objeto original al que le añadiremos funcionalidades.
 */
public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café simple";
    }

    @Override
    public double getCosto() {
        return 1.50;
    }
}
