package ejemplos.juego;

public class FabricaDeElfos implements FabricaDeFaccion{
    @Override
    public Guerrero crearGuerrero() {
        return new GuerreroElfo();
    }

    @Override
    public Fortaleza crearFortaleza() {
        return new FortalezaElfa();
    }
}
