package ejemplos.cafe;

public class Azucar extends BebidaDecorator{
    public Azucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", con Azucar";
    }

    @Override
    public float getCoste() {
        return super.getCoste() + 0.2f;
    }
}
