package builder;

/**
 * Un Builder Concreto: construye y ensambla las partes para crear una pizza hawaiana.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void construirMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void construirSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void construirRelleno() {
        pizza.setRelleno("jamón y piña");
    }
}
