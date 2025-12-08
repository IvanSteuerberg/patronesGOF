package ejemplos.musica;

import java.util.ArrayList;
import java.util.List;

/**
 * El Agregado Concreto (Concrete Aggregate).
 * Implementa la interfaz de la colección y su método de fábrica para el iterador.
 * Contiene la colección de objetos.
 */
public class Playlist implements ColeccionDeCanciones {
    private List<Cancion> canciones;

    public Playlist() {
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public IteradorCanciones crearIterador() {
        return new IteradorPlaylist(this);
    }
}
