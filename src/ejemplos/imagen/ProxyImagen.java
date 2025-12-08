package ejemplos.imagen;

/**
 * Esta es la clase Proxy.
 * Tiene la misma interfaz que la ImagenReal y mantiene una referencia a ella.
 * Controla el acceso al objeto real y es responsable de su creación
 * y destrucción (en este caso, solo creación perezosa).
 */
public class ProxyImagen implements Imagen {
    private String url;
    private ImagenReal imagenReal; // La referencia al objeto real, inicialmente null

    public ProxyImagen(String url) {
        this.url = url;
        // El constructor del proxy es muy rápido, no descarga nada.
        System.out.println("Proxy para la imagen '" + url + "' creado. La imagen no se ha cargado todavía.");
    }

    @Override
    public void mostrar() {
        // La inicialización perezosa (Lazy Initialization) ocurre aquí.
        if (imagenReal == null) {
            System.out.println("La imagen '" + url + "' necesita ser mostrada. Iniciando carga perezosa.");
            // Se crea el objeto real solo cuando se necesita por primera vez.
            imagenReal = new ImagenReal(url);
        }
        // Una vez que el objeto real existe (ya sea recién creado o de una llamada anterior),
        // simplemente se delega la llamada.
        imagenReal.mostrar();
    }
}
