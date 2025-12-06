package proxy;

/**
 * El Cliente.
 * Interactúa con el Proxy a través de la interfaz Subject.
 */
public class MainProxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            System.out.println("Intentando conectar a google.com...");
            internet.connectTo("google.com");
            System.out.println("Conexión exitosa.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        try {
            System.out.println("Intentando conectar a facebook.com...");
            internet.connectTo("facebook.com");
            System.out.println("Conexión exitosa.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        try {
            System.out.println("Intentando conectar a banned.com...");
            internet.connectTo("banned.com");
            System.out.println("Conexión exitosa.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }
    }
}
