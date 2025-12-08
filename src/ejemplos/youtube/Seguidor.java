package ejemplos.youtube;

public class Seguidor implements Observer{

    private Subject canal;

    @Override
    public void update() {
        String msg = (String) canal.getUpdate(this);
            System.out.println("Seguidor: " + msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.canal = sub;

    }
}
