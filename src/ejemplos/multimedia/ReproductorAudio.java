package ejemplos.multimedia;

public class ReproductorAudio implements ReproductorMultimedia{

    MultimediaAdapter multimediaAdapter;

    @Override
    public void reproducir(String tipoAudio, String nombreArchivo) {
        if (nombreArchivo.endsWith(".mp3"))
            System.out.println("Reproduciendo mp3: " + nombreArchivo);
        else if (nombreArchivo.endsWith(".mp4") || nombreArchivo.endsWith(".vlc")) {
            multimediaAdapter = new MultimediaAdapter(tipoAudio);
            multimediaAdapter.reproducir(tipoAudio, nombreArchivo);
        }
        else {
            System.out.println("Formato de medio no válido. " + tipoAudio + " no es compatible.");
        }
    }
}
