
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
    "@xmlns$xsd",
    "@xmlns$xsi",
    "ALG-GEG",
    "KENT-GEG",
    "VRTG-STAND-GEG",
    "CARROS-UITV-TAB",
    "BPM-GEG",
    "VRTG-TERUGR-GEG",
    "BYZ-VRTG-TAB",
    "BR-VRTG-TAB",
    "AS-VRTG-TAB",
    "SUB-CAT-EU-TAB",
    "TEL-STAND-GEG",
    "TERUGR-ACT-TAB"
})
public class OPENBVRTGINFO {

    @JsonProperty("@xmlns$xsd")
    private String xmlns$xsd;
    @JsonProperty("@xmlns$xsi")
    private String xmlns$xsi;
    @JsonProperty("ALG-GEG")
    private Object aLGGEG;
    @JsonProperty("KENT-GEG")
    private KENTGEG kENTGEG;
    @JsonProperty("VRTG-STAND-GEG")
    private VRTGSTANDGEG vRTGSTANDGEG;
    @JsonProperty("CARROS-UITV-TAB")
    private CARROSUITVTAB cARROSUITVTAB;
    @JsonProperty("BPM-GEG")
    private BPMGEG bPMGEG;
    @JsonProperty("VRTG-TERUGR-GEG")
    private VRTGTERUGRGEG vRTGTERUGRGEG;
    @JsonProperty("BYZ-VRTG-TAB")
    private Object bYZVRTGTAB;
    @JsonProperty("BR-VRTG-TAB")
    private Object bRVRTGTAB;
    @JsonProperty("AS-VRTG-TAB")
    private ASVRTGTAB aSVRTGTAB;
    @JsonProperty("SUB-CAT-EU-TAB")
    private Object sUBCATEUTAB;
    @JsonProperty("TEL-STAND-GEG")
    private Object tELSTANDGEG;
    @JsonProperty("TERUGR-ACT-TAB")
    private TERUGRACTTAB tERUGRACTTAB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@xmlns$xsd")
    public String getXmlns$xsd() {
        return xmlns$xsd;
    }

    @JsonProperty("@xmlns$xsd")
    public void setXmlns$xsd(String xmlns$xsd) {
        this.xmlns$xsd = xmlns$xsd;
    }

    @JsonProperty("@xmlns$xsi")
    public String getXmlns$xsi() {
        return xmlns$xsi;
    }

    @JsonProperty("@xmlns$xsi")
    public void setXmlns$xsi(String xmlns$xsi) {
        this.xmlns$xsi = xmlns$xsi;
    }

    @JsonProperty("ALG-GEG")
    public Object getALGGEG() {
        return aLGGEG;
    }

    @JsonProperty("ALG-GEG")
    public void setALGGEG(Object aLGGEG) {
        this.aLGGEG = aLGGEG;
    }

    @JsonProperty("KENT-GEG")
    public KENTGEG getKENTGEG() {
        return kENTGEG;
    }

    @JsonProperty("KENT-GEG")
    public void setKENTGEG(KENTGEG kENTGEG) {
        this.kENTGEG = kENTGEG;
    }

    @JsonProperty("VRTG-STAND-GEG")
    public VRTGSTANDGEG getVRTGSTANDGEG() {
        return vRTGSTANDGEG;
    }

    @JsonProperty("VRTG-STAND-GEG")
    public void setVRTGSTANDGEG(VRTGSTANDGEG vRTGSTANDGEG) {
        this.vRTGSTANDGEG = vRTGSTANDGEG;
    }

    @JsonProperty("CARROS-UITV-TAB")
    public CARROSUITVTAB getCARROSUITVTAB() {
        return cARROSUITVTAB;
    }

    @JsonProperty("CARROS-UITV-TAB")
    public void setCARROSUITVTAB(CARROSUITVTAB cARROSUITVTAB) {
        this.cARROSUITVTAB = cARROSUITVTAB;
    }

    @JsonProperty("BPM-GEG")
    public BPMGEG getBPMGEG() {
        return bPMGEG;
    }

    @JsonProperty("BPM-GEG")
    public void setBPMGEG(BPMGEG bPMGEG) {
        this.bPMGEG = bPMGEG;
    }

    @JsonProperty("VRTG-TERUGR-GEG")
    public VRTGTERUGRGEG getVRTGTERUGRGEG() {
        return vRTGTERUGRGEG;
    }

    @JsonProperty("VRTG-TERUGR-GEG")
    public void setVRTGTERUGRGEG(VRTGTERUGRGEG vRTGTERUGRGEG) {
        this.vRTGTERUGRGEG = vRTGTERUGRGEG;
    }

    @JsonProperty("BYZ-VRTG-TAB")
    public Object getBYZVRTGTAB() {
        return bYZVRTGTAB;
    }

    @JsonProperty("BYZ-VRTG-TAB")
    public void setBYZVRTGTAB(Object bYZVRTGTAB) {
        this.bYZVRTGTAB = bYZVRTGTAB;
    }

    @JsonProperty("BR-VRTG-TAB")
    public Object getBRVRTGTAB() {
        return bRVRTGTAB;
    }

    @JsonProperty("BR-VRTG-TAB")
    public void setBRVRTGTAB(Object bRVRTGTAB) {
        this.bRVRTGTAB = bRVRTGTAB;
    }

    @JsonProperty("AS-VRTG-TAB")
    public ASVRTGTAB getASVRTGTAB() {
        return aSVRTGTAB;
    }

    @JsonProperty("AS-VRTG-TAB")
    public void setASVRTGTAB(ASVRTGTAB aSVRTGTAB) {
        this.aSVRTGTAB = aSVRTGTAB;
    }

    @JsonProperty("SUB-CAT-EU-TAB")
    public Object getSUBCATEUTAB() {
        return sUBCATEUTAB;
    }

    @JsonProperty("SUB-CAT-EU-TAB")
    public void setSUBCATEUTAB(Object sUBCATEUTAB) {
        this.sUBCATEUTAB = sUBCATEUTAB;
    }

    @JsonProperty("TEL-STAND-GEG")
    public Object getTELSTANDGEG() {
        return tELSTANDGEG;
    }

    @JsonProperty("TEL-STAND-GEG")
    public void setTELSTANDGEG(Object tELSTANDGEG) {
        this.tELSTANDGEG = tELSTANDGEG;
    }

    @JsonProperty("TERUGR-ACT-TAB")
    public TERUGRACTTAB getTERUGRACTTAB() {
        return tERUGRACTTAB;
    }

    @JsonProperty("TERUGR-ACT-TAB")
    public void setTERUGRACTTAB(TERUGRACTTAB tERUGRACTTAB) {
        this.tERUGRACTTAB = tERUGRACTTAB;
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
