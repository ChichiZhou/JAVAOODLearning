package GoF.observer;

import java.util.ArrayList;

public class DataSource extends Subject{
    private Integer value;

    // 在初始化的时候生成 arraylist
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
