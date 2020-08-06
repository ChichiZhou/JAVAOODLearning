package GoF.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察的对象
 */
public class Subject {
    protected List<Observer> observers;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    // 这个实现主要逻辑，通知所有观察者，调用观察者的 Update
    public void notifyObserver(Integer value){
        for(Observer observer: observers){
            observer.update(value);        // 在这里调用
        }
    }
}
