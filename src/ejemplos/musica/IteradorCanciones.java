package ejemplos.musica;

/**
 * La interfaz del Iterador.
 * Declara los métodos para navegar por una colección.
 */
public interface IteradorCanciones {
    boolean hasNext();
    Cancion next();
}
