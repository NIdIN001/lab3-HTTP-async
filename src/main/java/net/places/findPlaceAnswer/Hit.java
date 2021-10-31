
package net.places.findPlaceAnswer;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "point",
    "name",
    "country",
    "countrycode",
    "state",
    "postcode",
    "osm_id",
    "osm_type",
    "osm_key",
    "osm_value",
    "extent",
    "city",
    "street",
    "housenumber",
    "house_number"
})

@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("jsonschema2pojo")
public class Hit {

    @JsonProperty("point")
    private Point point;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("countrycode")
    private String countrycode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("osm_id")
    private Long osmId;
    @JsonProperty("osm_type")
    private String osmType;
    @JsonProperty("osm_key")
    private String osmKey;
    @JsonProperty("osm_value")
    private String osmValue;
    @JsonProperty("extent")
    private List<Double> extent = null;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;
    @JsonProperty("housenumber")
    private String housenumber;
    @JsonProperty("house_number")
    private String houseNumber;

    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("countrycode")
    public String getCountrycode() {
        return countrycode;
    }

    @JsonProperty("countrycode")
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("osm_id")
    public Long getOsmId() {
        return osmId;
    }

    @JsonProperty("osm_id")
    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    @JsonProperty("osm_type")
    public String getOsmType() {
        return osmType;
    }

    @JsonProperty("osm_type")
    public void setOsmType(String osmType) {
        this.osmType = osmType;
    }

    @JsonProperty("osm_key")
    public String getOsmKey() {
        return osmKey;
    }

    @JsonProperty("osm_key")
    public void setOsmKey(String osmKey) {
        this.osmKey = osmKey;
    }

    @JsonProperty("osm_value")
    public String getOsmValue() {
        return osmValue;
    }

    @JsonProperty("osm_value")
    public void setOsmValue(String osmValue) {
        this.osmValue = osmValue;
    }

    @JsonProperty("extent")
    public List<Double> getExtent() {
        return extent;
    }

    @JsonProperty("extent")
    public void setExtent(List<Double> extent) {
        this.extent = extent;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("housenumber")
    public String getHousenumber() {
        return housenumber;
    }

    @JsonProperty("housenumber")
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    @JsonProperty("house_number")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("house_number")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

}
