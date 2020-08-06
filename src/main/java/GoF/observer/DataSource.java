package GoF.observer;

import java.util.ArrayList;

public class DataSource extends Subject{
    private Integer value;

    public DataSource(){
        observers = new ArrayList<>();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
        notifyObserver(value);
    }
}
