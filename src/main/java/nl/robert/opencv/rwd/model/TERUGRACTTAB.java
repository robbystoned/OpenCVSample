
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
    "TERUGR-ACT-GEG"
})
public class TERUGRACTTAB {

    @JsonProperty("TERUGR-ACT-GEG")
    private TERUGRACTGEG tERUGRACTGEG;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TERUGR-ACT-GEG")
    public TERUGRACTGEG getTERUGRACTGEG() {
        return tERUGRACTGEG;
    }

    @JsonProperty("TERUGR-ACT-GEG")
    public void setTERUGRACTGEG(TERUGRACTGEG tERUGRACTGEG) {
        this.tERUGRACTGEG = tERUGRACTGEG;
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
