package app;

public class TemperatureValidator {
    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 35;

    public static void validateTemperature(int temperature) {
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
            throw new TemperatureException("Temperature is out of range.");
        }
    }
}
