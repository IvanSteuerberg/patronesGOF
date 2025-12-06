package adapter;

/**
 * El Cliente.
 * Utiliza la interfaz "Target" (ReproductorMedia) para interactuar con los objetos.
 * No sabe nada sobre las clases "Adaptee".
 */
public class AudioPlayer implements ReproductorMedia {
    MediaAdapter mediaAdapter;

    @Override
    public void reproducir(String tipoAudio, String nombreArchivo) {
        // Soporte incorporado para reproducir archivos mp3
        if (tipoAudio.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo archivo mp3. Nombre: " + nombreArchivo);
        }
        // mediaAdapter proporciona soporte para otros formatos de archivo
        else if (tipoAudio.equalsIgnoreCase("vlc") || tipoAudio.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(tipoAudio);
            mediaAdapter.reproducir(tipoAudio, nombreArchivo);
        } else {
            System.out.println("Formato de medio no válido. " + tipoAudio + " no es compatible.");
        }
    }
}
