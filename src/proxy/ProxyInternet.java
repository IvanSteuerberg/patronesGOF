package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * El Proxy.
 * Mantiene una referencia que le permite al proxy acceder al objeto real.
 * Proporciona una interfaz idéntica a la del Sujeto.
 * Controla el acceso al objeto real y puede ser responsable de su creación y eliminación.
 */
public class ProxyInternet implements Internet {
    private final Internet internet = new RealInternet();
    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("twitter.com");
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("ACCESO DENEGADO: El sitio '" + serverHost + "' está prohibido.");
        }
        // Si el sitio no está prohibido, delega la llamada al objeto real.
        internet.connectTo(serverHost);
    }
}
