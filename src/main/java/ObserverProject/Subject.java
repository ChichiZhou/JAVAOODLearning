package ObserverProject;

public interface Subject {
    /**
     * 这个是观察的主题
     * @param o
     */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
