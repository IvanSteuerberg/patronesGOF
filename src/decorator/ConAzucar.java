package decorator;

/**
 * Otro Decorador Concreto.
 * Añade la funcionalidad de "azúcar" al objeto envuelto.
 */
public class ConAzucar extends BebidaDecorator {

    public ConAzucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", con Azúcar";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.25;
    }
}
