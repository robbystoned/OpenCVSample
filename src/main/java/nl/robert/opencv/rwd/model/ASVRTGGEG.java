
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
    "AS-NR-VRTG",
    "MAX-LAST-AS",
    "PLAATS-AS-CODE"
})
public class ASVRTGGEG {

    @JsonProperty("AS-NR-VRTG")
    private String aSNRVRTG;
    @JsonProperty("MAX-LAST-AS")
    private String mAXLASTAS;
    @JsonProperty("PLAATS-AS-CODE")
    private String pLAATSASCODE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AS-NR-VRTG")
    public String getASNRVRTG() {
        return aSNRVRTG;
    }

    @JsonProperty("AS-NR-VRTG")
    public void setASNRVRTG(String aSNRVRTG) {
        this.aSNRVRTG = aSNRVRTG;
    }

    @JsonProperty("MAX-LAST-AS")
    public String getMAXLASTAS() {
        return mAXLASTAS;
    }

    @JsonProperty("MAX-LAST-AS")
    public void setMAXLASTAS(String mAXLASTAS) {
        this.mAXLASTAS = mAXLASTAS;
    }

    @JsonProperty("PLAATS-AS-CODE")
    public String getPLAATSASCODE() {
        return pLAATSASCODE;
    }

    @JsonProperty("PLAATS-AS-CODE")
    public void setPLAATSASCODE(String pLAATSASCODE) {
        this.pLAATSASCODE = pLAATSASCODE;
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
