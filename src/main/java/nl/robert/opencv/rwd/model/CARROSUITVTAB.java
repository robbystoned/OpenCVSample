
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
    "CARROS-UITV-GEG"
})
public class CARROSUITVTAB {

    @JsonProperty("CARROS-UITV-GEG")
    private List<CARROSUITVGEG> cARROSUITVGEG = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CARROS-UITV-GEG")
    public List<CARROSUITVGEG> getCARROSUITVGEG() {
        return cARROSUITVGEG;
    }

    @JsonProperty("CARROS-UITV-GEG")
    public void setCARROSUITVGEG(List<CARROSUITVGEG> cARROSUITVGEG) {
        this.cARROSUITVGEG = cARROSUITVGEG;
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
