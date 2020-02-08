package ObserverProject;

public interface Subject {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObserver();

}
