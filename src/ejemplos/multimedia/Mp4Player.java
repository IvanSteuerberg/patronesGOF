package ejemplos.multimedia;


/**
 * Otra clase "Adaptee" concreta.
 * Implementa la reproducción de archivos MP4.
 */
public class Mp4Player implements ReproductorMultimediaAvanzado {
    @Override
    public void reproducirVlc(String nombreArchivo) {
        // No hace nada
    }

    @Override
    public void reproducirMp4(String nombreArchivo) {
        System.out.println("Reproduciendo archivo mp4. Nombre: " + nombreArchivo);
    }
}
