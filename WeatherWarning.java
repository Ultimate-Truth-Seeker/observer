public class WeatherWarning implements Observer {
    public void update(int i) {
        if (i >= 40) {
            System.out.println("ADVERTENCIA de temperatura alta: " + i);
        }
    }
    
}
