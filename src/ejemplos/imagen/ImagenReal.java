package ejemplos.imagen;

/**
 * Esta es la clase del Sujeto Real (RealSubject).
 * Contiene la lógica de negocio real y costosa.
 */
public class ImagenReal implements Imagen {
    private String url;

    public ImagenReal(String url) {
        this.url = url;
        // Simula la operación costosa de descargar la imagen desde la red.
        descargarImagen();
    }

    private void descargarImagen() {
        System.out.println("Descargando imagen desde: " + url + " (Operación costosa)...");
        // Simula un retardo en la descarga
        try {
            Thread.sleep(2000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Imagen descargada.");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando imagen: " + url);
    }
}
