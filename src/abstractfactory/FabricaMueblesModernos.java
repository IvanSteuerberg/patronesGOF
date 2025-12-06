package abstractfactory;

/**
 * Factoría concreta para crear muebles de estilo Moderno.
 */
public class FabricaMueblesModernos implements FabricaMuebles {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
