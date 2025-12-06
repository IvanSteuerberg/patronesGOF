package builder;

/**
 * El Director: construye un objeto utilizando la interfaz Builder.
 * Es responsable de ejecutar los pasos de construcción en un orden particular.
 */
public class Cocinero {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void construirPizza() {
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.construirMasa();
        pizzaBuilder.construirSalsa();
        pizzaBuilder.construirRelleno();
    }
}
