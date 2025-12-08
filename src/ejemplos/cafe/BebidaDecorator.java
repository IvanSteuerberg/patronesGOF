package ejemplos.cafe;

public abstract class BebidaDecorator implements Bebida{
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    public float getCoste() {
        return bebidaDecorada.getCoste();
    }

    public String getDescripcion() {
        return bebidaDecorada.getDescripcion();
    }

}
