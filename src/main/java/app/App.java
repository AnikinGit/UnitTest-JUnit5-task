package app;

public class App {
    public static void main(String[] args) {
        TemperatureDevice device = new TemperatureDevice();
        TemperatureDataProvider dataProvider = new TemperatureDataProvider();

        int currentTemperature = dataProvider.getTemperature();

        try {
            device.operate(currentTemperature);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Device cannot operate outside of the temperature range.");
        }
    }
}
