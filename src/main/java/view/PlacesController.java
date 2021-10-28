package view;

import javafx.application.Platform;
import net.places.descriptionAnswer.Description;
import net.places.findPlaceAnswer.Hit;
import net.places.placesAnswer.Feature;

import java.util.HashMap;
import java.util.List;

public class PlacesController {
    private MenuController menuController;

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public void setDescription(Description description) {
//        System.out.println(description.toString());
        Platform.runLater(() -> menuController.updatePlaceDescription(description.getName(), description.getRate(), description.getOtm(),
                description.getPoint().getLat().toString(), description.getPoint().getLon().toString()));
    }

    public void setPlacesList(List<Hit> hits) {
        Platform.runLater(() -> menuController.updatePlaces(hits));
    }

    public void setFeaturesMap(HashMap<String, Feature> featuresMap) {
        Platform.runLater(() -> menuController.updatePlaces(featuresMap));
    }
}
