package ejemplos.musica;

public class MainMusica {
    public static void main(String[] args) {
        // 1. Creamos la colección concreta
        Playlist miPlaylist = new Playlist();
        miPlaylist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen"));
        miPlaylist.agregarCancion(new Cancion("Stairway to Heaven", "Led Zeppelin"));
        miPlaylist.agregarCancion(new Cancion("Hotel California", "Eagles"));

        // 2. Obtenemos un iterador de la colección.
        // El cliente no sabe ni le importa cómo está implementado el iterador.
        System.out.println("Iniciando reproducción de la playlist...");
        IteradorCanciones iterador = miPlaylist.crearIterador();

        // 3. Recorremos la colección usando solo los métodos del iterador.
        // Este bucle funcionaría igual si la Playlist usara un array, un LinkedList, etc.
        while (iterador.hasNext()) {
            Cancion cancionActual = iterador.next();
            System.out.println("Reproduciendo ahora: " + cancionActual);
        }

        System.out.println("\nFin de la playlist.");
    }
}
