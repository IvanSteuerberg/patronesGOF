package ejemplos.youtube;

public interface Subject {
    void attach(Observer obj);
    void detach(Observer obj);
    void notifyObservers();
    Object getUpdate(Observer obj);
}
