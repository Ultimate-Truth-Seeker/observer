public class TemperatureDisplay implements Observer {
    public void update(int i) {
        System.out.println("Temperatura: " + i);
    }
    
}
