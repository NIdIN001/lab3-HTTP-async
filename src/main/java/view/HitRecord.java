package view;

import javafx.scene.text.Text;

public class HitRecord extends Text {
    private Double lat;
    private Double lon;

    public HitRecord() {
        super();
    }

    public HitRecord(String text, Double lat, Double lon) {
        super(text);
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }
}
