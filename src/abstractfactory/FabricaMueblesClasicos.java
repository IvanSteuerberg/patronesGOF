package abstractfactory;

/**
 * Factoría concreta para crear muebles de estilo Clásico.
 */
public class FabricaMueblesClasicos implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }
}
