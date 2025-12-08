package ejemplos.rutas;

public class MainNavigation {

    public static void main(String[] args) {
        NavigationContext context = new NavigationContext();

        System.out.println("Estrategia de Bus:");
        context.setStrategy(new BusStrategy());
        context.calcularRuta();

        System.out.println("\nEstrategia Caminando:");
        context.setStrategy(new CaminandoStrategy());
        context.calcularRuta();

        System.out.println("\nEstrategia de Coche:");
        context.setStrategy(new CocheStrategy());
        context.calcularRuta();
    }


}
