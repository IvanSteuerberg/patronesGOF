package decorator;

/**
 * El Decorador Abstracto.
 * Mantiene una referencia al objeto Componente y define una interfaz
 * que se ajusta a la interfaz del Componente.
 */
public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto();
    }
}
