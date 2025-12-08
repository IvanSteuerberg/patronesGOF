package ejemplos.empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase Compuesta (Composite).
 * Puede contener tanto objetos Hoja (Empleado) como otros objetos Compuestos (Departamento).
 * Implementa la interfaz Componente y delega las operaciones a sus hijos.
 */
public class Departamento implements EntidadOrganizacional {
    private String nombre;
    private List<EntidadOrganizacional> miembros;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(EntidadOrganizacional miembro) {
        miembros.add(miembro);
    }

    public void removerMiembro(EntidadOrganizacional miembro) {
        miembros.remove(miembro);
    }

    @Override
    public void mostrarDetalles(String indentacion) {
        System.out.println(indentacion + "+ Departamento: " + nombre);
        // Recorre los miembros y llama a su método mostrarDetalles recursivamente
        for (EntidadOrganizacional miembro : miembros) {
            miembro.mostrarDetalles(indentacion + "  "); // Aumenta la indentación para los hijos
        }
    }
}
