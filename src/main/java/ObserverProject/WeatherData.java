package ObserverProject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    String temperature;
    String presure;
    ArrayList<Observer> observerArrayList;

    public WeatherData(String temperature, String presure){
        this.temperature = temperature;
        this.presure = presure;
        this.observerArrayList = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observerArrayList.add(o);
    }

    public void deleteObserver(Observer o) {
        observerArrayList.remove(o);
    }

    public void notifyObserver() {
        for (Observer o : observerArrayList){
            o.update();
        }
    }



}
