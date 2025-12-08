package ejemplos.youtube;

import java.util.ArrayList;
import java.util.List;

public class CanalDeYoutube implements Subject{
    private List<Observer> suscriptores;
    private String message;
    private boolean changed;

    public CanalDeYoutube() {
        this.suscriptores = new ArrayList<>();
    }

    @Override
    public void attach(Observer obj) {
        suscriptores.add(obj);
        obj.setSubject(this);
    }

    @Override
    public void detach(Observer obj) {
        suscriptores.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer sub : suscriptores) {
            sub.update();
        }
    }

    public void publicarVideo(String videoTitle){
        message = "Nuevo video: " + videoTitle;
        notifyObservers();
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }
}
