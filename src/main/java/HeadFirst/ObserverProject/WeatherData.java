package HeadFirst.ObserverProject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    /**
     * 根据《Thinking in JAVA》
     * 可以在方法的内部完成对当前对象的引用（也就是说可以引用当前对象的 类实例和类方法）
     * 调用的方法是在前面加 this
     * 但是也可以不加 this （在构造的时候通常这么用）
     */
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
