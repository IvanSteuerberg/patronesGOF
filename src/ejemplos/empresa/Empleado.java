package ejemplos.empresa;

/**
 * Esta es la clase Hoja (Leaf).
 * Representa un objeto individual en la composición. Un empleado no puede
 * tener otros empleados o departamentos bajo su cargo en esta estructura.
 */
public class Empleado implements EntidadOrganizacional {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDetalles(String indentacion) {
        System.out.println(indentacion + "- " + nombre + " (" + puesto + ")");
    }
}
