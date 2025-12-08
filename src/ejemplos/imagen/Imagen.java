package ejemplos.imagen;

/**
 * Esta es la interfaz del Sujeto (Subject).
 * Define la interfaz común tanto para la ImagenReal como para el Proxy,
 * de modo que el Proxy pueda sustituir a la ImagenReal.
 */
public interface Imagen {
    void mostrar();
}
