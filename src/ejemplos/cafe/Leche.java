package ejemplos.cafe;

public class Leche extends BebidaDecorator{
    public Leche(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", con Leche";
    }

    @Override
    public float getCoste() {
        return super.getCoste() + 0.5f;
    }
}
