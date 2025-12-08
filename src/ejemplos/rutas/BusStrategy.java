package ejemplos.rutas;

public class BusStrategy implements NavigationStrategy{
    @Override
    public void calcularRuta() {
        System.out.println("Calculando ruta en bus");
    }
}
