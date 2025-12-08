package ejemplos.cafe;

public class Cafe implements Bebida{
    @Override
    public float getCoste() {
        return 1.0f;
    }

    @Override
    public String getDescripcion() {
        return "Café simple";
    }
}
