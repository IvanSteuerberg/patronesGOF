package ejemplos.multimedia;

public class MultimediaAdapter implements ReproductorMultimedia{

    private ReproductorMultimediaAvanzado reproductorAvanzado;

    public MultimediaAdapter(String tipoAudio) {
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
