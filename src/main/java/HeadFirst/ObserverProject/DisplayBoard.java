package HeadFirst.ObserverProject;

public class DisplayBoard implements Observer{
    String temperature;
    String pressure;
    WeatherData weatherData;          // 单独一个遥控器也可以调用其类变量

    public DisplayBoard(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);   // 采用这种初始化的方式，就不需要在 main 中手动添加 GoF.observer
    };

    public void update() {
        this.temperature = weatherData.temperature;
        this.pressure = weatherData.presure;

    }
}
