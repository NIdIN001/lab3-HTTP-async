package net.places;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import constants.Constants;
import net.places.findPlaceAnswer.PlacePos;
import view.PlacesController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

public class PlacesFindRepository {
    private final String lang = "ru";
    private final HttpClient client = HttpClient.newHttpClient();

    private String key;

    @Inject
    private PlacesController controller;

    @Inject
    public PlacesFindRepository() {
        try (InputStream inputStream = new FileInputStream(Constants.pathToConfig)) {
            Properties props = new Properties();
            props.load(inputStream);
            key = props.getProperty("graphhopperApiKey");
        } catch (IOException e) {
            System.out.println("Can't read from config file!");
            e.printStackTrace();
        }
    }

    public void makeAsyncRequestByName(String place) {
        HttpRequest request = HttpRequest.newBuilder(
                URI.create("https://graphhopper.com/api/1/geocode?" +
                        "q=" + place + "&" +
                        "locale=" + lang + "&" +
                        "key=" + key))
                .header("accept", "application/json")
                .build();

        CompletableFuture<String> answer = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(stringHttpResponse -> {
                    try {
                        PlacePos placePosAnswer = new ObjectMapper().readValue(stringHttpResponse.body(), PlacePos.class);

                        controller.setPlacesList(placePosAnswer.getHits());
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }

                    System.out.println(stringHttpResponse.body());
                    return null;
                });
    }
}
