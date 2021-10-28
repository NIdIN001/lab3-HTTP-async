
package net.places.descriptionAnswer;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "geometry",
    "attributes"
})

@JsonIgnoreProperties(ignoreUnknown=true)
@Generated("jsonschema2pojo")
public class Sources {

    @JsonProperty("geometry")
    private String geometry;
    @JsonProperty("attributes")
    private List<String> attributes = null;

    @JsonProperty("geometry")
    public String getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("attributes")
    public List<String> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

}
