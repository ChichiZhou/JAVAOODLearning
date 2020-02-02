package ObserverProject;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;  // 这里仅仅是一个指针
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for (Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurement(float temperature, float humidity, float perssure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = perssure;

        notifyObserver();   // 这个保证能够通知到所有的 observer
    }
}
