public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(16);
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(weatherWarning);
        weatherStation.addObserver(temperatureDisplay);

        weatherStation.setTemperature(28);
        weatherStation.setTemperature(42);
    }
    
}
