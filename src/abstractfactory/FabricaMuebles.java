package abstractfactory;

/**
 * La interfaz de la Factoría Abstracta.
 * Declara los métodos para crear los productos abstractos (Silla y Mesa).
 */
public interface FabricaMuebles {
    Silla crearSilla();
    Mesa crearMesa();
}
