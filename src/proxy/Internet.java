package proxy;

/**
 * La interfaz Subject.
 * Declara la interfaz común para el Objeto Real y el Proxy.
 * De esta manera, el cliente puede usar el Proxy como si fuera el objeto real.
 */
public interface Internet {
    void connectTo(String serverHost) throws Exception;
}
