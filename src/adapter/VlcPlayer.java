package adapter;

/**
 * Una clase "Adaptee" concreta.
 * Implementa la reproducción de archivos VLC.
 */
public class VlcPlayer implements ReproductorMediaAvanzado {
    @Override
    public void reproducirVlc(String nombreArchivo) {
        System.out.println("Reproduciendo archivo vlc. Nombre: " + nombreArchivo);
    }

    @Override
    public void reproducirMp4(String nombreArchivo) {
        // No hace nada
    }
}
