package ejemplos.empresa;

public class MainEmpresa {
    public static void main(String[] args) {
        // Creamos los empleados individuales (hojas)
        Empleado juan = new Empleado("Juan Pérez", "Desarrollador Backend");
        Empleado maria = new Empleado("María García", "Desarrolladora Frontend");
        Empleado pedro = new Empleado("Pedro López", "Arquitecto de Software");
        Empleado laura = new Empleado("Laura Martínez", "Gerente de Proyecto");

        // Creamos los departamentos (compuestos)
        Departamento desarrollo = new Departamento("Desarrollo de Software");
        Departamento gestion = new Departamento("Gestión de Proyectos");

        // Creamos el departamento principal que contiene a los otros
        Departamento ingenieria = new Departamento("Ingeniería");

        // Organizamos la estructura:
        // 1. Añadimos empleados al departamento de desarrollo
        desarrollo.agregarMiembro(juan);
        desarrollo.agregarMiembro(maria);

        // 2. Añadimos un empleado al departamento de gestión
        gestion.agregarMiembro(laura);

        // 3. Añadimos los sub-departamentos y un empleado directo al departamento de ingeniería
        ingenieria.agregarMiembro(desarrollo); // Un compuesto dentro de otro
        ingenieria.agregarMiembro(gestion);
        ingenieria.agregarMiembro(pedro); // Una hoja directamente en el compuesto principal

        // Mostramos toda la estructura con una sola llamada
        System.out.println("Estructura Organizacional de la Empresa:");
        ingenieria.mostrarDetalles("");
    }
}
