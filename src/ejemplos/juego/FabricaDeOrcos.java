package ejemplos.juego;

public class FabricaDeOrcos implements FabricaDeFaccion{
    @Override
    public Guerrero crearGuerrero() {
        return new GuerreroOrco();
    }

    @Override
    public Fortaleza crearFortaleza() {
        return new FortalezaOrca();
    }
}
