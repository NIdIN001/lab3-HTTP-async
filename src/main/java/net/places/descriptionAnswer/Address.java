
package net.places.descriptionAnswer;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "city",
    "road",
    "state",
    "county",
    "country",
    "postcode",
    "country_code",
    "house_number",
    "city_district"
})

@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("city")
    private String city;
    @JsonProperty("road")
    private String road;
    @JsonProperty("state")
    private String state;
    @JsonProperty("county")
    private String county;
    @JsonProperty("country")
    private String country;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("house_number")
    private String houseNumber;
    @JsonProperty("city_district")
    private String cityDistrict;

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("road")
    public String getRoad() {
        return road;
    }

    @JsonProperty("road")
    public void setRoad(String road) {
        this.road = road;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("county")
    public String getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("house_number")
    public String getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("house_number")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @JsonProperty("city_district")
    public String getCityDistrict() {
        return cityDistrict;
    }

    @JsonProperty("city_district")
    public void setCityDistrict(String cityDistrict) {
        this.cityDistrict = cityDistrict;
    }

}
