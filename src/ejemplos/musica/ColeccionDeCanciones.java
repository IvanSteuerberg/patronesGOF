package ejemplos.musica;

/**
 * La interfaz del Agregado (Aggregate).
 * Declara un método de fábrica para producir un iterador.
 */
public interface ColeccionDeCanciones {
    IteradorCanciones crearIterador();
}
