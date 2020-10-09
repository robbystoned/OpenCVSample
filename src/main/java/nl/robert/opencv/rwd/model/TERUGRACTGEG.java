
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
    "STAT-V-TER-OMS",
    "B-DAT-TERUG-RDW",
    "TERUGR-RIS-TAB"
})
public class TERUGRACTGEG {

    @JsonProperty("STAT-V-TER-OMS")
    private String sTATVTEROMS;
    @JsonProperty("B-DAT-TERUG-RDW")
    private String bDATTERUGRDW;
    @JsonProperty("TERUGR-RIS-TAB")
    private TERUGRRISTAB tERUGRRISTAB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("STAT-V-TER-OMS")
    public String getSTATVTEROMS() {
        return sTATVTEROMS;
    }

    @JsonProperty("STAT-V-TER-OMS")
    public void setSTATVTEROMS(String sTATVTEROMS) {
        this.sTATVTEROMS = sTATVTEROMS;
    }

    @JsonProperty("B-DAT-TERUG-RDW")
    public String getBDATTERUGRDW() {
        return bDATTERUGRDW;
    }

    @JsonProperty("B-DAT-TERUG-RDW")
    public void setBDATTERUGRDW(String bDATTERUGRDW) {
        this.bDATTERUGRDW = bDATTERUGRDW;
    }

    @JsonProperty("TERUGR-RIS-TAB")
    public TERUGRRISTAB getTERUGRRISTAB() {
        return tERUGRRISTAB;
    }

    @JsonProperty("TERUGR-RIS-TAB")
    public void setTERUGRRISTAB(TERUGRRISTAB tERUGRRISTAB) {
        this.tERUGRRISTAB = tERUGRRISTAB;
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
