package ejemplos.rutas;

public class NavigationContext {
    private NavigationStrategy navigationMethod;

    public void setStrategy(NavigationStrategy navigationMethod){
        this.navigationMethod = navigationMethod;
    }

    public void calcularRuta(){
        navigationMethod.calcularRuta();
    }
}
