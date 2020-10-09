
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
    "TERUGR-STAT-OMS"
})
public class VRTGTERUGRGEG {

    @JsonProperty("TERUGR-STAT-OMS")
    private String tERUGRSTATOMS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TERUGR-STAT-OMS")
    public String getTERUGRSTATOMS() {
        return tERUGRSTATOMS;
    }

    @JsonProperty("TERUGR-STAT-OMS")
    public void setTERUGRSTATOMS(String tERUGRSTATOMS) {
        this.tERUGRSTATOMS = tERUGRSTATOMS;
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
