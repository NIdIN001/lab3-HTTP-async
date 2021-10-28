
package net.places.descriptionAnswer;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "xid",
    "name",
    "address",
    "rate",
    "kinds",
    "sources",
    "otm",
    "info",
    "image",
    "preview",
    "point"
})

@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("jsonschema2pojo")
public class Description {

    @JsonProperty("xid")
    private String xid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("kinds")
    private String kinds;
    @JsonProperty("sources")
    private Sources sources;
    @JsonProperty("otm")
    private String otm;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("image")
    private String image;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("point")
    private Point point;

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

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    @JsonProperty("kinds")
    public String getKinds() {
        return kinds;
    }

    @JsonProperty("kinds")
    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    @JsonProperty("sources")
    public Sources getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(Sources sources) {
        this.sources = sources;
    }

    @JsonProperty("otm")
    public String getOtm() {
        return otm;
    }

    @JsonProperty("otm")
    public void setOtm(String otm) {
        this.otm = otm;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
    }

}
