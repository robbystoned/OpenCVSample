
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
    "CARROS-VNR",
    "TYPE-CARROS-EU",
    "TYPE-CARROS-OMS"
})
public class CARROSUITVGEG {

    @JsonProperty("CARROS-VNR")
    private String cARROSVNR;
    @JsonProperty("TYPE-CARROS-EU")
    private String tYPECARROSEU;
    @JsonProperty("TYPE-CARROS-OMS")
    private String tYPECARROSOMS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CARROS-VNR")
    public String getCARROSVNR() {
        return cARROSVNR;
    }

    @JsonProperty("CARROS-VNR")
    public void setCARROSVNR(String cARROSVNR) {
        this.cARROSVNR = cARROSVNR;
    }

    @JsonProperty("TYPE-CARROS-EU")
    public String getTYPECARROSEU() {
        return tYPECARROSEU;
    }

    @JsonProperty("TYPE-CARROS-EU")
    public void setTYPECARROSEU(String tYPECARROSEU) {
        this.tYPECARROSEU = tYPECARROSEU;
    }

    @JsonProperty("TYPE-CARROS-OMS")
    public String getTYPECARROSOMS() {
        return tYPECARROSOMS;
    }

    @JsonProperty("TYPE-CARROS-OMS")
    public void setTYPECARROSOMS(String tYPECARROSOMS) {
        this.tYPECARROSOMS = tYPECARROSOMS;
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
