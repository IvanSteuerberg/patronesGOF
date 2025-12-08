package ejemplos.youtube;

public class MainYoutube {

    public static void main(String[] args) {
        CanalDeYoutube youtuber1 = new CanalDeYoutube();
        Seguidor sub1 = new Seguidor();
        Seguidor sub2 = new Seguidor();
        Seguidor sub3 = new Seguidor();

        youtuber1.attach(sub1);
        youtuber1.attach(sub2);
        youtuber1.attach(sub3);

        youtuber1.publicarVideo("No creerás lo que pasó!");
        youtuber1.detach(sub2);
        youtuber1.publicarVideo("PARTE 2");

    }
}
