package net.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import constants.Constants;
import net.weather.weatherAnswer.WeatherAnswer;
import view.WeatherController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

public class WeatherRepository {
    @Inject
    private WeatherController weatherController;

    private String key;
    private final HttpClient client = HttpClient.newHttpClient();

    @Inject
    public WeatherRepository() {
        try (InputStream inputStream = new FileInputStream(Constants.pathToConfig)) {
            Properties props = new Properties();
            props.load(inputStream);
            key = props.getProperty("weatherApiKey");
        } catch (IOException e) {
            System.out.println("Can't read from config file!");
            e.printStackTrace();
        }
    }

    public void makeAsyncRequestByName(String city) {
        HttpRequest request = HttpRequest.newBuilder(
                URI.create("http://api.openweathermap.org/data/2.5/weather?" +
                        "q=" + city +
                        "&appid=" + key))
                .GET()
                .header("accept", "application/json")
                .build();

        CompletableFuture<String> ans = makeAsyncRequest(request);
    }

    public void makeAsyncRequestByCoords(Double lat, Double lon) {
        HttpRequest request = HttpRequest.newBuilder(
                URI.create("http://api.openweathermap.org/data/2.5/weather?" +
                        "lat=" + lat.toString() +
                        "&lon=" + lon.toString() +
                        "&appid=" + key))
                .GET()
                .header("accept", "application/json")
                .build();


        CompletableFuture<String> ans = makeAsyncRequest(request);
    }

    private CompletableFuture<String> makeAsyncRequest(HttpRequest request) {
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(stringHttpResponse -> {
            try {
                WeatherAnswer answer = new ObjectMapper().readValue(stringHttpResponse.body(), WeatherAnswer.class);
                weatherController.setWeather(answer);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
