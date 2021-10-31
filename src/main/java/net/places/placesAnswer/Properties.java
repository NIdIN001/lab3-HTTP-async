
package net.places.placesAnswer;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "xid",
    "name",
    "dist",
    "rate",
    "osm",
    "kinds",
    "wikidata"
})

@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("jsonschema2pojo")
public class Properties {

    @JsonProperty("xid")
    private String xid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dist")
    private Double dist;
    @JsonProperty("rate")
    private Integer rate;
    @JsonProperty("osm")
    private String osm;
    @JsonProperty("kinds")
    private String kinds;
    @JsonProperty("wikidata")
    private String wikidata;

    @JsonProperty("xid")
    public String getXid() {
        return xid;
    }

    @JsonProperty("xid")
    public void setXid(String xid) {
        this.xid = xid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("dist")
    public Double getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(Double dist) {
        this.dist = dist;
    }

    @JsonProperty("rate")
    public Integer getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @JsonProperty("osm")
    public String getOsm() {
        return osm;
    }

    @JsonProperty("osm")
    public void setOsm(String osm) {
        this.osm = osm;
    }

    @JsonProperty("kinds")
    public String getKinds() {
        return kinds;
    }

    @JsonProperty("kinds")
    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    @JsonProperty("wikidata")
    public String getWikidata() {
        return wikidata;
    }

    @JsonProperty("wikidata")
    public void setWikidata(String wikidata) {
        this.wikidata = wikidata;
    }

}
