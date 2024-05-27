import java.util.ArrayList;

public class WeatherStation implements Subject{
    private ArrayList<Observer> observers;
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public WeatherStation(int temperature) {
        observers = new ArrayList<>();
        this.temperature = temperature;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}
