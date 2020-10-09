
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
    "BPM-BEDRAG"
})
public class BPMGEG {

    @JsonProperty("BPM-BEDRAG")
    private String bPMBEDRAG;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BPM-BEDRAG")
    public String getBPMBEDRAG() {
        return bPMBEDRAG;
    }

    @JsonProperty("BPM-BEDRAG")
    public void setBPMBEDRAG(String bPMBEDRAG) {
        this.bPMBEDRAG = bPMBEDRAG;
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
