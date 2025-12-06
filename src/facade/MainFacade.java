package facade;

/**
 * El Cliente.
 * Interactúa con el subsistema únicamente a través de la fachada.
 */
public class MainFacade {
    public static void main(String[] args) {
        // El cliente solo necesita crear una instancia de la fachada.
        BotonStart boton = new BotonStart();

        // Y usar sus métodos simples.
        boton.presionarBotonEncendido();
        boton.presionarBotonApagado();
    }
}
