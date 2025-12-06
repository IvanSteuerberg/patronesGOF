package adapter;

/**
 * El Adaptador.
 * Implementa la interfaz "Target" (ReproductorMedia) y contiene una instancia
 * de una de las clases "Adaptee" (ReproductorMediaAvanzado).
 * Traduce las llamadas del cliente a llamadas compatibles con el "Adaptee".
 */
public class MediaAdapter implements ReproductorMedia {

    ReproductorMediaAvanzado reproductorAvanzado;

    public MediaAdapter(String tipoAudio) {
        if (tipoAudio.equalsIgnoreCase("vlc")) {
            reproductorAvanzado = new VlcPlayer();
        } else if (tipoAudio.equalsIgnoreCase("mp4")) {
            reproductorAvanzado = new Mp4Player();
        }
    }

    @Override
    public void reproducir(String tipoAudio, String nombreArchivo) {
        if (tipoAudio.equalsIgnoreCase("vlc")) {
            reproductorAvanzado.reproducirVlc(nombreArchivo);
        } else if (tipoAudio.equalsIgnoreCase("mp4")) {
            reproductorAvanzado.reproducirMp4(nombreArchivo);
        }
    }
}
