package ejemplos.cine;

public class ModoCine {
    private SistemaLuces sistemaLuces;
    private SistemaMultimedia sistemaMultimedia;
    private SistemaDeClimatizacion sistemaDeClimatizacion;
    private SistemaDeSeguridad sistemaDeSeguridad;

    public ModoCine(SistemaLuces sistemaLuces, SistemaMultimedia sistemaMultimedia, SistemaDeClimatizacion sistemaDeClimatizacion, SistemaDeSeguridad sistemaDeSeguridad) {
        this.sistemaLuces = sistemaLuces;
        this.sistemaMultimedia = sistemaMultimedia;
        this.sistemaDeClimatizacion = sistemaDeClimatizacion;
        this.sistemaDeSeguridad = sistemaDeSeguridad;
    }

    public void encenderModoCine(String pelicula) {
        System.out.println("Encendiendo modo cine...");
        sistemaDeSeguridad.desactivarAlarma();
        sistemaDeSeguridad.bloquearPuertas();
        sistemaDeClimatizacion.encenderAireAcondicionado();
        sistemaDeClimatizacion.establecerTemperatura(20);
        sistemaLuces.apagarLuces();
        sistemaMultimedia.encenderProyector();
        sistemaMultimedia.reproducirPelicula(pelicula);
    }

    public void apagarModoCine() {
        System.out.println("Apagando modo cine...");
        sistemaMultimedia.detenerPelicula();
        sistemaMultimedia.apagarProyector();
        sistemaLuces.encenderLuces();
        sistemaDeClimatizacion.apagarAireAcondicionado();
        sistemaDeSeguridad.desbloquearPuertas();
        sistemaDeSeguridad.activarAlarma();
    }

}
