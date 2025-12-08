package ejemplos.multimedia;

/**
 * La interfaz del "Adaptee" (adaptado).
 * Define la interfaz para los reproductores de medios avanzados que queremos adaptar.
 */
public interface ReproductorMultimediaAvanzado {
    void reproducirVlc(String nombreArchivo);
    void reproducirMp4(String nombreArchivo);
}
