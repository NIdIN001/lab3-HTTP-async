package view;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import net.weather.TemperatureConverter;
import net.weather.weatherAnswer.WeatherAnswer;

public class WeatherController {
    private final StringProperty temperature = new SimpleStringProperty();
    private final StringProperty windSpeed = new SimpleStringProperty();
    private final StringProperty feelsLike = new SimpleStringProperty();
    private final StringProperty humidity = new SimpleStringProperty();

    private MenuController menuController;

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public StringProperty humidityProperty() {
        return humidity;
    }

    public StringProperty feelsLikeProperty() {
        return feelsLike;
    }

    public StringProperty windSpeedProperty() {
        return windSpeed;
    }

    public StringProperty temperatureProperty() {
        return temperature;
    }

    public final String getTemperature() {
        return temperatureProperty().get();
    }

    public String getWindSpeed() {
        return windSpeed.get();
    }

    public String getFeelsLike() {
        return feelsLike.get();
    }

    public String getHumidity() {
        return humidity.get();
    }

    public final void setWeather(WeatherAnswer weather) {
        Platform.runLater(() -> {
            Double realTemp = TemperatureConverter.KelvinToCelsius(weather.getMain().getTemp());
            Double feelsLikeTemp = TemperatureConverter.KelvinToCelsius(weather.getMain().getFeelsLike());

            temperature.set("temperature: " + String.format("%.1f", realTemp) + " °c");
            feelsLike.set("feels like: " + String.format("%.1f", feelsLikeTemp) + " °c");
            windSpeed.set("wind: " + weather.getWind().getSpeed().toString() + " m/s");
            humidity.set("humidity: " + weather.getMain().getHumidity().toString() + "%");
        });
    }
}
