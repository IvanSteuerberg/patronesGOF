package ejemplos.multimedia;

public class MainReproductor {
    public static void main(String[] args) {
        ReproductorAudio reproductorAudio = new ReproductorAudio();

        reproductorAudio.reproducir("mp3", "himno.mp3");
        reproductorAudio.reproducir("mp4", "solo.mp4");
        reproductorAudio.reproducir("vlc", "lejos.vlc");
        reproductorAudio.reproducir("avi", "mind.avi");
    }

}
