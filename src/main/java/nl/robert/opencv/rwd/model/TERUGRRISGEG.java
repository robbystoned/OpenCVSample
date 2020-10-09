
package nl.robert.opencv.rwd.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TERUGR-RIS-OMS"
})
public class TERUGRRISGEG {

    @JsonProperty("TERUGR-RIS-OMS")
    private String tERUGRRISOMS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TERUGR-RIS-OMS")
    public String getTERUGRRISOMS() {
        return tERUGRRISOMS;
    }

    @JsonProperty("TERUGR-RIS-OMS")
    public void setTERUGRRISOMS(String tERUGRRISOMS) {
        this.tERUGRRISOMS = tERUGRRISOMS;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}