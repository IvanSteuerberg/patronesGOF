package adapter;

/**
 * La interfaz del "Adaptee" (adaptado).
 * Define la interfaz para los reproductores de medios avanzados que queremos adaptar.
 */
public interface ReproductorMediaAvanzado {
    void reproducirVlc(String nombreArchivo);
    void reproducirMp4(String nombreArchivo);
}
