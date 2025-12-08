package ejemplos.rutas;

public class CaminandoStrategy implements NavigationStrategy{
    @Override
    public void calcularRuta() {
        System.out.println("Calculando ruta a pie");
    }
}
