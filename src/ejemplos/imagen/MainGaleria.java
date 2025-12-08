package ejemplos.imagen;

public class MainGaleria {
    public static void main(String[] args) {
        System.out.println("--- Iniciando aplicación de galería ---");

        // Creamos varios proxies para las imágenes.
        // La descarga costosa NO ocurre aquí.
        Imagen imagen1 = new ProxyImagen("http://ejemplo.com/imagen1.jpg");
        Imagen imagen2 = new ProxyImagen("http://ejemplo.com/imagen2.jpg");
        Imagen imagen3 = new ProxyImagen("http://ejemplo.com/imagen3.jpg");

        System.out.println("\n--- Proxies creados, la aplicación está lista rápidamente ---");
        System.out.println("El usuario navega por la galería...");

        // El usuario decide ver la imagen 1.
        // La descarga costosa de imagen1 ocurre AHORA.
        System.out.println("\n--- El usuario hace clic en la imagen 1 ---");
        imagen1.mostrar(); // Primera llamada, descarga y muestra

        System.out.println("\n--- El usuario vuelve a ver la imagen 1 ---");
        imagen1.mostrar(); // Segunda llamada, solo muestra (ya está descargada)

        // El usuario decide ver la imagen 3.
        // La descarga costosa de imagen3 ocurre AHORA.
        System.out.println("\n--- El usuario hace clic en la imagen 3 ---");
        imagen3.mostrar(); // Primera llamada, descarga y muestra

        System.out.println("\n--- Fin de la demostración ---");
    }
}
