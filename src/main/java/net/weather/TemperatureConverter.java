package net.weather;

public class TemperatureConverter {
    public static double KelvinToCelsius(double kelvin) {
        return kelvin - 273;
    }

    public static double CelsiusToKelvin(double celsius) {
        return celsius + 273;
    }
}
