package view;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import net.places.PlacesDescriptionRepository;
import net.places.PlacesFindRepository;
import net.places.findPlaceAnswer.Hit;
import net.places.placesAnswer.Feature;
import net.weather.WeatherRepository;

import java.util.HashMap;
import java.util.List;

public class MenuController {
    @Inject
    private WeatherRepository weatherRepository;
    @Inject
    private PlacesDescriptionRepository placesDescriptionRepository;
    @Inject
    private PlacesFindRepository placesFindRepository;


    @FXML
    private TextField textField;
    @FXML
    private Button findButton;
    @FXML
    private VBox vbox;

    @FXML
    private Label temperatureLabel;
    @FXML
    private Label feelsLikeLabel;
    @FXML
    private Label humidityLabel;
    @FXML
    private Label windSpeedLabel;

    @Inject
    private WeatherController weatherController;
    @Inject
    private PlacesController placesController;

    @FXML
    private Label placeName;
    @FXML
    private Label placeRate;
    @FXML
    private Hyperlink placeLink;
    @FXML
    private Label placeLat;
    @FXML
    private Label placeLon;


    public void initialize() {
        temperatureLabel.textProperty().bind(weatherController.temperatureProperty());
        feelsLikeLabel.textProperty().bind(weatherController.feelsLikeProperty());
        humidityLabel.textProperty().bind(weatherController.humidityProperty());
        windSpeedLabel.textProperty().bind(weatherController.windSpeedProperty());

        weatherController.setMenuController(this);
        placesController.setMenuController(this);
    }

    @FXML
    private void find(ActionEvent event) {
        //String request = textField.getText();
        placesFindRepository.makeAsyncRequestByName(textField.getText());
        //placesDescriptionRepository.makeAsyncRequestByCoords(55.0415, 82.9346, 1000);
        //weatherRepository.makeAsyncRequestByCoords(55.0415, 82.9346);
    }

    private void findInfoAboutPlace(MouseEvent event) {
        PlaceRecord record = (PlaceRecord) event.getSource();
        System.out.println("Click on: " + record.getXid());

        placesDescriptionRepository.makeAsyncDescriptionRequest(record.getXid());
    }

    private void findPlaceByCoords(MouseEvent event) {
        HitRecord hit = (HitRecord) event.getSource();

        placesDescriptionRepository.makeAsyncRequestByCoords(hit.getLat(), hit.getLon(), 2000);
        weatherRepository.makeAsyncRequestByCoords(hit.getLat(), hit.getLon());
        vbox.getChildren().clear();
    }

    public void updatePlaces(List<Hit> hitsList) {
        vbox.getChildren().clear();

        hitsList.forEach(hit -> {
            HitRecord hitRecord = new HitRecord(hit.getName() + ", " + hit.getCountry(),
                    hit.getPoint().getLat(), hit.getPoint().getLng());

            hitRecord.setOnMouseClicked(this::findPlaceByCoords);

            vbox.getChildren().add(hitRecord);
        });
    }

    public void updatePlaces(HashMap<String, Feature> featuresMap) {
        vbox.getChildren().clear();

        featuresMap.values().forEach(feature -> {
            if (feature.getProperties().getName().equals(""))
                return;

            PlaceRecord record = new PlaceRecord(feature.getProperties().getName());
            record.setXid(feature.getProperties().getXid());

            record.setOnMouseClicked(this::findInfoAboutPlace);

            vbox.getChildren().add(record);
        });
    }

    public void updatePlaceDescription(String name, String rate, String link, String lat, String lon) {
        placeName.setText(name);
        placeRate.setText("rate: " + rate);
        placeLink.setText(link);
        placeLat.setText("lat: " + lat);
        placeLon.setText("lon: " + lon);
    }
}
