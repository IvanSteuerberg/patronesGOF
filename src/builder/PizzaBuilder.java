package builder;

/**
 * El Builder abstracto: especifica una interfaz para crear las partes del objeto Producto.
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void crearNuevaPizza() {
        pizza = new Pizza();
    }

    public abstract void construirMasa();
    public abstract void construirSalsa();
    public abstract void construirRelleno();
}
