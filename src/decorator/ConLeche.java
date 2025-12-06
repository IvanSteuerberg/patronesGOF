package decorator;

/**
 * Un Decorador Concreto.
 * Añade la funcionalidad de "leche" al objeto envuelto.
 */
public class ConLeche extends BebidaDecorator {

    public ConLeche(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", con Leche";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.50;
    }
}
