package ObserverProject;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData("1", "2");
        DisplayBoard displayBoard = new DisplayBoard(weatherData);
        displayBoard.weatherData = weatherData;

//        weatherData.addObserver(displayBoard);
        weatherData.notifyObserver();

        System.out.println(displayBoard.temperature);


    }
}
