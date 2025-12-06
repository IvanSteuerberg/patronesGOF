package abstractfactory;

public class MainAbstractFactory {

    /**
     * El método principal que configura y ejecuta la aplicación.
     */
    public static void main(String[] args) {

        FabricaMuebles fabrica;
        fabrica = new FabricaMueblesModernos();
        Silla silla = fabrica.crearSilla();
        Mesa mesa = fabrica.crearMesa();
        silla.sentarse();
        mesa.ponerCosas();

        /*
        // Decidir qué fábrica usar. Esto podría basarse en una configuración,
        // la preferencia del usuario, etc.
        String estiloPreferido = "Moderno"; // Cambia a "Clásico" para ver el otro resultado
        FabricaMuebles fabrica;

        System.out.println("Preferencia de estilo: " + estiloPreferido);

        if (estiloPreferido.equalsIgnoreCase("Moderno")) {
            fabrica = new FabricaMueblesModernos();
        } else {
            fabrica = new FabricaMueblesClasicos();
        }

        // El cliente no sabe ni le importa qué fábrica concreta se está usando.
        ClienteMuebles cliente = new ClienteMuebles(fabrica);
        cliente.usarMuebles();

        System.out.println("\n----------------------------------------");

        // Ahora probamos con la otra fábrica para ver el cambio
        System.out.println("Preferencia de estilo: Clásico");
        fabrica = new FabricaMueblesClasicos();
        cliente = new ClienteMuebles(fabrica);
        cliente.usarMuebles();
        */
    }
}
