package org.example.app.utils;

import app.TemperatureException;
import app.TemperatureValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Temperature Validator Tests")
public class TemperatureValidatorTest {
    @Test
    @DisplayName("Valid temperature should not throw exception")
    void testValidTemperature() {
        assertDoesNotThrow(() -> TemperatureValidator.validateTemperature(20));
    }

    @Test
    @DisplayName("Temperature below lower limit should throw exception")
    void testTemperatureBelowLowerLimit() {
        assertThrows(TemperatureException.class, () -> TemperatureValidator.validateTemperature(-15));
    }

    @Test
    @DisplayName("Temperature above upper limit should throw exception")
    void testTemperatureAboveUpperLimit() {
        assertThrows(TemperatureException.class, () -> TemperatureValidator.validateTemperature(40));
    }
}
