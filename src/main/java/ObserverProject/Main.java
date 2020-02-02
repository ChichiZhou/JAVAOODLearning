package ObserverProject;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // 这里一定要先创建一个 weatherData 否则无法创建 DisplayBoard

        DisplayBoard currentDisplay = new DisplayBoard(weatherData);
        DisplayBoard staticDisplay = new DisplayBoard(weatherData);

        weatherData.setMeasurement(10, 20, 30);


    }
}
