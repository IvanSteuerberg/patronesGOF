package ejemplos.juego;

public class Cliente {
    public static void main(String[] args) {
        // Ejemplo con Elfos
        FabricaDeFaccion fabricaElfos = new FabricaDeElfos();
        Guerrero guerreroElfo = fabricaElfos.crearGuerrero();
        Fortaleza fortalezaElfa = fabricaElfos.crearFortaleza();

        System.out.println("--- Facción Elfa ---");
        guerreroElfo.atacar();
        fortalezaElfa.producirUnidades();
        System.out.println();

        // Ejemplo con Orcos
        FabricaDeFaccion fabricaOrcos = new FabricaDeOrcos();
        Guerrero guerreroOrco = fabricaOrcos.crearGuerrero();
        Fortaleza fortalezaOrca = fabricaOrcos.crearFortaleza();

        System.out.println("--- Facción Orca ---");
        guerreroOrco.atacar();
        fortalezaOrca.producirUnidades();
    }

}
