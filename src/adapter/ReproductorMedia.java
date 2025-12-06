package adapter;

/**
 * La interfaz "Target".
 * Esta es la interfaz que el cliente espera y utiliza.
 */
public interface ReproductorMedia {
    void reproducir(String tipoAudio, String nombreArchivo);
}
