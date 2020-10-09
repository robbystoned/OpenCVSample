
package nl.robert.opencv.rwd.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AS-VRTG-GEG"
})
public class ASVRTGTAB {

    @JsonProperty("AS-VRTG-GEG")
    private List<ASVRTGGEG> aSVRTGGEG = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AS-VRTG-GEG")
    public List<ASVRTGGEG> getASVRTGGEG() {
        return aSVRTGGEG;
    }

    @JsonProperty("AS-VRTG-GEG")
    public void setASVRTGGEG(List<ASVRTGGEG> aSVRTGGEG) {
        this.aSVRTGGEG = aSVRTGGEG;
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
