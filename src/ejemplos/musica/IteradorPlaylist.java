package ejemplos.musica;

/**
 * El Iterador Concreto (Concrete Iterator).
 * Implementa la interfaz del iterador y mantiene el estado de la iteración
 * (por ejemplo, la posición actual) sobre un Agregado Concreto específico.
 */
public class IteradorPlaylist implements IteradorCanciones {
    private Playlist playlist;
    private int posicionActual = 0;

    public IteradorPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        // Comprueba si la posición actual está dentro de los límites de la lista
        return posicionActual < playlist.getCanciones().size();
    }

    @Override
    public Cancion next() {
        // Devuelve la canción en la posición actual y luego incrementa la posición
        if (this.hasNext()) {
            return playlist.getCanciones().get(posicionActual++);
        }
        return null; // O lanzar una excepción NoSuchElementException
    }
}
