package ObserverProject;

public class DisplayBoard implements Observer, DisplaymElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public DisplayBoard(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  // 这个保证  构造的同时  就已经注册上了
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public void display() {
        System.out.println("Board says" + temperature + " " + humidity + " " + pressure);
    }
}
