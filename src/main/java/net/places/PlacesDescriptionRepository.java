package net.places;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import constants.Constants;
import net.places.descriptionAnswer.Description;
import net.places.placesAnswer.Feature;
import net.places.placesAnswer.Places;
import view.PlacesController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

public class PlacesDescriptionRepository {
    private final int radiusOfSearch = 10000;
    private final String lang = "ru";
    private final HttpClient client = HttpClient.newHttpClient();

    private String key;

    @Inject
    private PlacesController controller;

    @Inject
    public PlacesDescriptionRepository() {
        try (InputStream inputStream = new FileInputStream(Constants.pathToConfig)) {
            Properties props = new Properties();
            props.load(inputStream);
            key = props.getProperty("openTripMapApiKey");
        } catch (IOException e) {
            System.out.println("Can't read from config file!");
            e.printStackTrace();
        }
    }

    public void makeAsyncRequestByCoords(Double lat, Double lon, Integer radius) {
        HttpRequest request = HttpRequest.newBuilder(
                URI.create("http://api.opentripmap.com/0.1/ru/places/radius?" +
                        "lang=" + lang + "&" +
                        "radius=" + radiusOfSearch + "&" +
                        "lon=" + lon.toString() + "&" +
                        "lat=" + lat.toString() + "&" +
                        "apikey=" + key))
                .header("accept", "application/json")
                .build();


        CompletableFuture<String> answer = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(stringHttpResponse -> {
                    HashMap<String, Feature> featuresMap = new HashMap<>();
                    try {
                        Places answers = new ObjectMapper().readValue(stringHttpResponse.body(), Places.class);
                        answers.getFeatures().forEach(feature -> featuresMap.put(feature.getId(), feature));

                        controller.setFeaturesMap(featuresMap);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }

                    return null;
                });
    }

    private int a = 0;

    public void makeAsyncDescriptionRequest(String xid) {
        System.out.println(++a);
        HttpRequest request = HttpRequest.newBuilder(
                URI.create("http://api.opentripmap.com/0.1/ru/places/xid/" + xid + "?" +
                        "lang=" + lang + "&" +
                        "xid=" + xid + "&" +
                        "apikey=" + key))
                .header("accept", "application/json")
                .build();

        CompletableFuture<String> answer = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(stringHttpResponse -> {
                    try {
                        System.out.println(stringHttpResponse.body());
                        Description description = new ObjectMapper().readValue(stringHttpResponse.body(), Description.class);

                        controller.setDescription(description);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    return null;
                });
    }
}
