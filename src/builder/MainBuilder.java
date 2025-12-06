package builder;

public class MainBuilder {

    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero();

        // Construir una pizza hawaiana
        PizzaBuilder pizzero = new HawaiianPizzaBuilder();
        cocinero.setPizzaBuilder(pizzero);
        cocinero.construirPizza();
        Pizza pizzaHawaiana = cocinero.getPizza();;
        System.out.println("Pizza creada: " + pizzaHawaiana);

        System.out.println("----------------------------------------");

        // Construir una pizza picante
        pizzero = new SpicyPizzaBuilder();
        cocinero.setPizzaBuilder(pizzero);
        cocinero.construirPizza();
        Pizza pizzaPicante = cocinero.getPizza();
        System.out.println("Pizza creada: " + pizzaPicante);
    }
}
