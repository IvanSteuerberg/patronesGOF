package facade;

/**
 * La Fachada (Facade).
 * Proporciona una interfaz simple para un subsistema complejo.
 * Delega las peticiones del cliente a los objetos apropiados del subsistema.
 */
public class BotonStart {
    private final SistemaElectrico sistemaElectrico;
    private final Sensores sensores;
    private final Motor motor;

    /**
     * El constructor de la fachada crea las instancias del subsistema.
     */
    public BotonStart() {
        this.sistemaElectrico = new SistemaElectrico();
        this.sensores = new Sensores();
        this.motor = new Motor();
    }

    /**
     * Método simplificado para encender el coche.
     * Orquesta las llamadas al subsistema.
     */
    public void presionarBotonEncendido() {
        System.out.println(">>> Presionando botón de encendido...");
        sistemaElectrico.suministrarEnergia();
        sensores.comprobarPresionNeumaticos();
        sensores.comprobarNivelAceite();
        motor.arrancar();
        System.out.println(">>> Coche encendido y listo.\n");
    }

    /**
     * Método simplificado para apagar el coche.
     */
    public void presionarBotonApagado() {
        System.out.println(">>> Presionando botón de apagado...");
        motor.apagar();
        sensores.apagar();
        sistemaElectrico.apagar();
        System.out.println(">>> Coche apagado.");
    }
}
