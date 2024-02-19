package app;

public class TemperatureDevice {

    public void operate(int temperature) {
        TemperatureValidator.validateTemperature(temperature);
        System.out.println("Device is operating at temperature: " + temperature);
    }
}
