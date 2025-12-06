package proxy;

/**
 * El Objeto Real (RealSubject).
 * Es el objeto "real" que el proxy representa.
 */
public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Conectando a " + serverHost);
    }
}
