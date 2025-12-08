package ejemplos.cine;

public class MainCine {
    public static void main(String[] args) {
        SistemaLuces sistemaLuces = new SistemaLuces();
        SistemaMultimedia sistemaMultimedia = new SistemaMultimedia();
        SistemaDeClimatizacion sistemaDeClimatizacion = new SistemaDeClimatizacion();
        SistemaDeSeguridad sistemaDeSeguridad = new SistemaDeSeguridad();

        ModoCine modoCine = new ModoCine(sistemaLuces, sistemaMultimedia, sistemaDeClimatizacion, sistemaDeSeguridad);

        modoCine.encenderModoCine("Avatar");
        System.out.println("\n---------------------------------\n");
        modoCine.apagarModoCine();
    }

}
