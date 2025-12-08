package ejemplos.pizza;

public class MainPizza {

    public static void main(String[] args) {
        // Ahora la creación es legible, encadenada y segura.
        Pizza pizzaHawaiana = new Pizza.PizzaBuilder("Familiar", "Fina")
                .conPepperoni(true) // En la pizza hawaiana es jamón, pero usamos pepperoni para el ejemplo
                .conAceitunas(false)
                .build();

        System.out.println("--- Pizza Hawaiana (ejemplo) ---");
        System.out.println(pizzaHawaiana);

        Pizza pizzaBarbacoa = new Pizza.PizzaBuilder("Mediana", "Gruesa")
                .conQuesoExtra(true)
                .conPepperoni(true)
                .build();

        System.out.println("--- Pizza Barbacoa ---");
        System.out.println(pizzaBarbacoa);
    }
}
