package ejemplos.rutas;

public class CocheStrategy implements NavigationStrategy{
    @Override
    public void calcularRuta() {
        System.out.println("Calculando ruta en coche");
    }
}
