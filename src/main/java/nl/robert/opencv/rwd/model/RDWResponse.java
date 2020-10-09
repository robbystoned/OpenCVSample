
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
    "version",
    "encoding",
    "OPENB-VRTG-INFO"
})
public class RDWResponse {

    @JsonProperty("version")
    private String version;
    @JsonProperty("encoding")
    private String encoding;
    @JsonProperty("OPENB-VRTG-INFO")
    private OPENBVRTGINFO oPENBVRTGINFO;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    @JsonProperty("encoding")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @JsonProperty("OPENB-VRTG-INFO")
    public OPENBVRTGINFO getOPENBVRTGINFO() {
        return oPENBVRTGINFO;
    }

    @JsonProperty("OPENB-VRTG-INFO")
    public void setOPENBVRTGINFO(OPENBVRTGINFO oPENBVRTGINFO) {
        this.oPENBVRTGINFO = oPENBVRTGINFO;
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
