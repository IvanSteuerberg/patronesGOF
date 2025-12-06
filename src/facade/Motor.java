package facade;

/**
 * Parte del subsistema complejo.
 * Se encarga del arranque y parada del motor.
 */
public class Motor {
    public void arrancar() {
        System.out.println("Motor: Arrancando...");
    }

    public void apagar() {
        System.out.println("Motor: Apagado.");
    }
}
