package abstractfactory;

/**
 * La clase cliente que utiliza la factoría.
 * No sabe qué factoría concreta (y por tanto, qué estilo de muebles) está utilizando.
 */
public class ClienteMuebles {
    private final Silla silla;
    private final Mesa mesa;

    public ClienteMuebles(FabricaMuebles fabrica) {
        System.out.println("Cliente: Creando muebles con la fábrica proporcionada.");
        this.silla = fabrica.crearSilla();
        this.mesa = fabrica.crearMesa();
    }

    public void usarMuebles() {
        System.out.println("\nCliente: Usando los muebles creados...");
        silla.sentarse();
        mesa.ponerCosas();
        System.out.println("Estilo de la mesa: " + mesa.obtenerEstilo());
        System.out.println("La silla tiene patas: " + silla.tienePatas());
    }
}
