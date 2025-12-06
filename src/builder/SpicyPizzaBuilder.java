package builder;

/**
 * Otro Builder Concreto: construye y ensambla las partes para crear una pizza picante.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    @Override
    public void construirMasa() {
        pizza.setMasa("fina y crujiente");
    }

    @Override
    public void construirSalsa() {
        pizza.setSalsa("picante de tomate");
    }

    @Override
    public void construirRelleno() {
        pizza.setRelleno("pepperoni y salami");
    }
}
