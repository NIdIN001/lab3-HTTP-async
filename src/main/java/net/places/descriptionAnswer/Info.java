
package net.places.descriptionAnswer;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "src",
    "url",
    "descr",
    "image",
    "src_id"
})

@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("jsonschema2pojo")
public class Info {

    @JsonProperty("src")
    private String src;
    @JsonProperty("url")
    private String url;
    @JsonProperty("descr")
    private String descr;
    @JsonProperty("image")
    private String image;
    @JsonProperty("src_id")
    private Integer srcId;

    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("descr")
    public String getDescr() {
        return descr;
    }

    @JsonProperty("descr")
    public void setDescr(String descr) {
        this.descr = descr;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("src_id")
    public Integer getSrcId() {
        return srcId;
    }

    @JsonProperty("src_id")
    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

}
