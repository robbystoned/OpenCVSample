
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
    "MERK-BESCHR",
    "TYPE-BESCHR-VTG",
    "ACT-KLEUR-1",
    "AANT-CYL",
    "CYL-INHOUD",
    "AANT-STAANPL",
    "MASSA-LEEG-VRTG",
    "LAADVERMOGEN",
    "MAX-MASSA-VRTG",
    "MAX-MAS-OPL-GER",
    "MAX-MAS-AUT-GER",
    "MAX-MAS-MID-GER",
    "MAX-CONSTR-SN",
    "EERSTE-INS-DAT",
    "EERSTE-TOEL-DAT",
    "REG-DAT-AANSPR",
    "REG-TYD-AANSPR",
    "VERV-DAT-KEUR",
    "VERZEKERD-IND",
    "STAT-WOK-IND",
    "STAT-GEST-IND",
    "VERBR-CAT-UITV",
    "EEG-VAR-CODE",
    "EEG-UITV-CODE",
    "EEG-VRTG-CAT-KB",
    "PL-VRTG-ID-NR-V",
    "AANT-EIGEN-VRTG",
    "AANT-OPNAM-BEDR",
    "STAT-EXP-IND",
    "AANT-DEUREN",
    "H-KOP-AZ-VRTG",
    "WIELBASIS",
    "VERV-DAT-TACH",
    "LENGTE",
    "BREEDTE",
    "AANT-ASSEN",
    "AANT-WIELEN",
    "AFW-MAX-SNELH",
    "MAS-BEDR-KL-MIN",
    "MAS-BEDR-KL-MAX",
    "MAX-MAS-T-MAX",
    "MAX-MAS-T-MIN",
    "SUB-CAT-NL",
    "SUB-CAT-NL-OMS"
})
public class VRTGSTANDGEG {

    @JsonProperty("MERK-BESCHR")
    private String mERKBESCHR;
    @JsonProperty("TYPE-BESCHR-VTG")
    private String tYPEBESCHRVTG;
    @JsonProperty("ACT-KLEUR-1")
    private String aCTKLEUR1;
    @JsonProperty("AANT-CYL")
    private String aANTCYL;
    @JsonProperty("CYL-INHOUD")
    private String cYLINHOUD;
    @JsonProperty("AANT-STAANPL")
    private Object aANTSTAANPL;
    @JsonProperty("MASSA-LEEG-VRTG")
    private String mASSALEEGVRTG;
    @JsonProperty("LAADVERMOGEN")
    private Object lAADVERMOGEN;
    @JsonProperty("MAX-MASSA-VRTG")
    private String mAXMASSAVRTG;
    @JsonProperty("MAX-MAS-OPL-GER")
    private Object mAXMASOPLGER;
    @JsonProperty("MAX-MAS-AUT-GER")
    private Object mAXMASAUTGER;
    @JsonProperty("MAX-MAS-MID-GER")
    private Object mAXMASMIDGER;
    @JsonProperty("MAX-CONSTR-SN")
    private Object mAXCONSTRSN;
    @JsonProperty("EERSTE-INS-DAT")
    private String eERSTEINSDAT;
    @JsonProperty("EERSTE-TOEL-DAT")
    private String eERSTETOELDAT;
    @JsonProperty("REG-DAT-AANSPR")
    private String rEGDATAANSPR;
    @JsonProperty("REG-TYD-AANSPR")
    private String rEGTYDAANSPR;
    @JsonProperty("VERV-DAT-KEUR")
    private Object vERVDATKEUR;
    @JsonProperty("VERZEKERD-IND")
    private String vERZEKERDIND;
    @JsonProperty("STAT-WOK-IND")
    private String sTATWOKIND;
    @JsonProperty("STAT-GEST-IND")
    private String sTATGESTIND;
    @JsonProperty("VERBR-CAT-UITV")
    private Object vERBRCATUITV;
    @JsonProperty("EEG-VAR-CODE")
    private Object eEGVARCODE;
    @JsonProperty("EEG-UITV-CODE")
    private Object eEGUITVCODE;
    @JsonProperty("EEG-VRTG-CAT-KB")
    private String eEGVRTGCATKB;
    @JsonProperty("PL-VRTG-ID-NR-V")
    private String pLVRTGIDNRV;
    @JsonProperty("AANT-EIGEN-VRTG")
    private String aANTEIGENVRTG;
    @JsonProperty("AANT-OPNAM-BEDR")
    private String aANTOPNAMBEDR;
    @JsonProperty("STAT-EXP-IND")
    private String sTATEXPIND;
    @JsonProperty("AANT-DEUREN")
    private Object aANTDEUREN;
    @JsonProperty("H-KOP-AZ-VRTG")
    private Object hKOPAZVRTG;
    @JsonProperty("WIELBASIS")
    private String wIELBASIS;
    @JsonProperty("VERV-DAT-TACH")
    private Object vERVDATTACH;
    @JsonProperty("LENGTE")
    private Object lENGTE;
    @JsonProperty("BREEDTE")
    private Object bREEDTE;
    @JsonProperty("AANT-ASSEN")
    private String aANTASSEN;
    @JsonProperty("AANT-WIELEN")
    private String aANTWIELEN;
    @JsonProperty("AFW-MAX-SNELH")
    private Object aFWMAXSNELH;
    @JsonProperty("MAS-BEDR-KL-MIN")
    private Object mASBEDRKLMIN;
    @JsonProperty("MAS-BEDR-KL-MAX")
    private Object mASBEDRKLMAX;
    @JsonProperty("MAX-MAS-T-MAX")
    private Object mAXMASTMAX;
    @JsonProperty("MAX-MAS-T-MIN")
    private Object mAXMASTMIN;
    @JsonProperty("SUB-CAT-NL")
    private Object sUBCATNL;
    @JsonProperty("SUB-CAT-NL-OMS")
    private Object sUBCATNLOMS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MERK-BESCHR")
    public String getMERKBESCHR() {
        return mERKBESCHR;
    }

    @JsonProperty("MERK-BESCHR")
    public void setMERKBESCHR(String mERKBESCHR) {
        this.mERKBESCHR = mERKBESCHR;
    }

    @JsonProperty("TYPE-BESCHR-VTG")
    public String getTYPEBESCHRVTG() {
        return tYPEBESCHRVTG;
    }

    @JsonProperty("TYPE-BESCHR-VTG")
    public void setTYPEBESCHRVTG(String tYPEBESCHRVTG) {
        this.tYPEBESCHRVTG = tYPEBESCHRVTG;
    }

    @JsonProperty("ACT-KLEUR-1")
    public String getACTKLEUR1() {
        return aCTKLEUR1;
    }

    @JsonProperty("ACT-KLEUR-1")
    public void setACTKLEUR1(String aCTKLEUR1) {
        this.aCTKLEUR1 = aCTKLEUR1;
    }

    @JsonProperty("AANT-CYL")
    public String getAANTCYL() {
        return aANTCYL;
    }

    @JsonProperty("AANT-CYL")
    public void setAANTCYL(String aANTCYL) {
        this.aANTCYL = aANTCYL;
    }

    @JsonProperty("CYL-INHOUD")
    public String getCYLINHOUD() {
        return cYLINHOUD;
    }

    @JsonProperty("CYL-INHOUD")
    public void setCYLINHOUD(String cYLINHOUD) {
        this.cYLINHOUD = cYLINHOUD;
    }

    @JsonProperty("AANT-STAANPL")
    public Object getAANTSTAANPL() {
        return aANTSTAANPL;
    }

    @JsonProperty("AANT-STAANPL")
    public void setAANTSTAANPL(Object aANTSTAANPL) {
        this.aANTSTAANPL = aANTSTAANPL;
    }

    @JsonProperty("MASSA-LEEG-VRTG")
    public String getMASSALEEGVRTG() {
        return mASSALEEGVRTG;
    }

    @JsonProperty("MASSA-LEEG-VRTG")
    public void setMASSALEEGVRTG(String mASSALEEGVRTG) {
        this.mASSALEEGVRTG = mASSALEEGVRTG;
    }

    @JsonProperty("LAADVERMOGEN")
    public Object getLAADVERMOGEN() {
        return lAADVERMOGEN;
    }

    @JsonProperty("LAADVERMOGEN")
    public void setLAADVERMOGEN(Object lAADVERMOGEN) {
        this.lAADVERMOGEN = lAADVERMOGEN;
    }

    @JsonProperty("MAX-MASSA-VRTG")
    public String getMAXMASSAVRTG() {
        return mAXMASSAVRTG;
    }

    @JsonProperty("MAX-MASSA-VRTG")
    public void setMAXMASSAVRTG(String mAXMASSAVRTG) {
        this.mAXMASSAVRTG = mAXMASSAVRTG;
    }

    @JsonProperty("MAX-MAS-OPL-GER")
    public Object getMAXMASOPLGER() {
        return mAXMASOPLGER;
    }

    @JsonProperty("MAX-MAS-OPL-GER")
    public void setMAXMASOPLGER(Object mAXMASOPLGER) {
        this.mAXMASOPLGER = mAXMASOPLGER;
    }

    @JsonProperty("MAX-MAS-AUT-GER")
    public Object getMAXMASAUTGER() {
        return mAXMASAUTGER;
    }

    @JsonProperty("MAX-MAS-AUT-GER")
    public void setMAXMASAUTGER(Object mAXMASAUTGER) {
        this.mAXMASAUTGER = mAXMASAUTGER;
    }

    @JsonProperty("MAX-MAS-MID-GER")
    public Object getMAXMASMIDGER() {
        return mAXMASMIDGER;
    }

    @JsonProperty("MAX-MAS-MID-GER")
    public void setMAXMASMIDGER(Object mAXMASMIDGER) {
        this.mAXMASMIDGER = mAXMASMIDGER;
    }

    @JsonProperty("MAX-CONSTR-SN")
    public Object getMAXCONSTRSN() {
        return mAXCONSTRSN;
    }

    @JsonProperty("MAX-CONSTR-SN")
    public void setMAXCONSTRSN(Object mAXCONSTRSN) {
        this.mAXCONSTRSN = mAXCONSTRSN;
    }

    @JsonProperty("EERSTE-INS-DAT")
    public String getEERSTEINSDAT() {
        return eERSTEINSDAT;
    }

    @JsonProperty("EERSTE-INS-DAT")
    public void setEERSTEINSDAT(String eERSTEINSDAT) {
        this.eERSTEINSDAT = eERSTEINSDAT;
    }

    @JsonProperty("EERSTE-TOEL-DAT")
    public String getEERSTETOELDAT() {
        return eERSTETOELDAT;
    }

    @JsonProperty("EERSTE-TOEL-DAT")
    public void setEERSTETOELDAT(String eERSTETOELDAT) {
        this.eERSTETOELDAT = eERSTETOELDAT;
    }

    @JsonProperty("REG-DAT-AANSPR")
    public String getREGDATAANSPR() {
        return rEGDATAANSPR;
    }

    @JsonProperty("REG-DAT-AANSPR")
    public void setREGDATAANSPR(String rEGDATAANSPR) {
        this.rEGDATAANSPR = rEGDATAANSPR;
    }

    @JsonProperty("REG-TYD-AANSPR")
    public String getREGTYDAANSPR() {
        return rEGTYDAANSPR;
    }

    @JsonProperty("REG-TYD-AANSPR")
    public void setREGTYDAANSPR(String rEGTYDAANSPR) {
        this.rEGTYDAANSPR = rEGTYDAANSPR;
    }

    @JsonProperty("VERV-DAT-KEUR")
    public Object getVERVDATKEUR() {
        return vERVDATKEUR;
    }

    @JsonProperty("VERV-DAT-KEUR")
    public void setVERVDATKEUR(Object vERVDATKEUR) {
        this.vERVDATKEUR = vERVDATKEUR;
    }

    @JsonProperty("VERZEKERD-IND")
    public String getVERZEKERDIND() {
        return vERZEKERDIND;
    }

    @JsonProperty("VERZEKERD-IND")
    public void setVERZEKERDIND(String vERZEKERDIND) {
        this.vERZEKERDIND = vERZEKERDIND;
    }

    @JsonProperty("STAT-WOK-IND")
    public String getSTATWOKIND() {
        return sTATWOKIND;
    }

    @JsonProperty("STAT-WOK-IND")
    public void setSTATWOKIND(String sTATWOKIND) {
        this.sTATWOKIND = sTATWOKIND;
    }

    @JsonProperty("STAT-GEST-IND")
    public String getSTATGESTIND() {
        return sTATGESTIND;
    }

    @JsonProperty("STAT-GEST-IND")
    public void setSTATGESTIND(String sTATGESTIND) {
        this.sTATGESTIND = sTATGESTIND;
    }

    @JsonProperty("VERBR-CAT-UITV")
    public Object getVERBRCATUITV() {
        return vERBRCATUITV;
    }

    @JsonProperty("VERBR-CAT-UITV")
    public void setVERBRCATUITV(Object vERBRCATUITV) {
        this.vERBRCATUITV = vERBRCATUITV;
    }

    @JsonProperty("EEG-VAR-CODE")
    public Object getEEGVARCODE() {
        return eEGVARCODE;
    }

    @JsonProperty("EEG-VAR-CODE")
    public void setEEGVARCODE(Object eEGVARCODE) {
        this.eEGVARCODE = eEGVARCODE;
    }

    @JsonProperty("EEG-UITV-CODE")
    public Object getEEGUITVCODE() {
        return eEGUITVCODE;
    }

    @JsonProperty("EEG-UITV-CODE")
    public void setEEGUITVCODE(Object eEGUITVCODE) {
        this.eEGUITVCODE = eEGUITVCODE;
    }

    @JsonProperty("EEG-VRTG-CAT-KB")
    public String getEEGVRTGCATKB() {
        return eEGVRTGCATKB;
    }

    @JsonProperty("EEG-VRTG-CAT-KB")
    public void setEEGVRTGCATKB(String eEGVRTGCATKB) {
        this.eEGVRTGCATKB = eEGVRTGCATKB;
    }

    @JsonProperty("PL-VRTG-ID-NR-V")
    public String getPLVRTGIDNRV() {
        return pLVRTGIDNRV;
    }

    @JsonProperty("PL-VRTG-ID-NR-V")
    public void setPLVRTGIDNRV(String pLVRTGIDNRV) {
        this.pLVRTGIDNRV = pLVRTGIDNRV;
    }

    @JsonProperty("AANT-EIGEN-VRTG")
    public String getAANTEIGENVRTG() {
        return aANTEIGENVRTG;
    }

    @JsonProperty("AANT-EIGEN-VRTG")
    public void setAANTEIGENVRTG(String aANTEIGENVRTG) {
        this.aANTEIGENVRTG = aANTEIGENVRTG;
    }

    @JsonProperty("AANT-OPNAM-BEDR")
    public String getAANTOPNAMBEDR() {
        return aANTOPNAMBEDR;
    }

    @JsonProperty("AANT-OPNAM-BEDR")
    public void setAANTOPNAMBEDR(String aANTOPNAMBEDR) {
        this.aANTOPNAMBEDR = aANTOPNAMBEDR;
    }

    @JsonProperty("STAT-EXP-IND")
    public String getSTATEXPIND() {
        return sTATEXPIND;
    }

    @JsonProperty("STAT-EXP-IND")
    public void setSTATEXPIND(String sTATEXPIND) {
        this.sTATEXPIND = sTATEXPIND;
    }

    @JsonProperty("AANT-DEUREN")
    public Object getAANTDEUREN() {
        return aANTDEUREN;
    }

    @JsonProperty("AANT-DEUREN")
    public void setAANTDEUREN(Object aANTDEUREN) {
        this.aANTDEUREN = aANTDEUREN;
    }

    @JsonProperty("H-KOP-AZ-VRTG")
    public Object getHKOPAZVRTG() {
        return hKOPAZVRTG;
    }

    @JsonProperty("H-KOP-AZ-VRTG")
    public void setHKOPAZVRTG(Object hKOPAZVRTG) {
        this.hKOPAZVRTG = hKOPAZVRTG;
    }

    @JsonProperty("WIELBASIS")
    public String getWIELBASIS() {
        return wIELBASIS;
    }

    @JsonProperty("WIELBASIS")
    public void setWIELBASIS(String wIELBASIS) {
        this.wIELBASIS = wIELBASIS;
    }

    @JsonProperty("VERV-DAT-TACH")
    public Object getVERVDATTACH() {
        return vERVDATTACH;
    }

    @JsonProperty("VERV-DAT-TACH")
    public void setVERVDATTACH(Object vERVDATTACH) {
        this.vERVDATTACH = vERVDATTACH;
    }

    @JsonProperty("LENGTE")
    public Object getLENGTE() {
        return lENGTE;
    }

    @JsonProperty("LENGTE")
    public void setLENGTE(Object lENGTE) {
        this.lENGTE = lENGTE;
    }

    @JsonProperty("BREEDTE")
    public Object getBREEDTE() {
        return bREEDTE;
    }

    @JsonProperty("BREEDTE")
    public void setBREEDTE(Object bREEDTE) {
        this.bREEDTE = bREEDTE;
    }

    @JsonProperty("AANT-ASSEN")
    public String getAANTASSEN() {
        return aANTASSEN;
    }

    @JsonProperty("AANT-ASSEN")
    public void setAANTASSEN(String aANTASSEN) {
        this.aANTASSEN = aANTASSEN;
    }

    @JsonProperty("AANT-WIELEN")
    public String getAANTWIELEN() {
        return aANTWIELEN;
    }

    @JsonProperty("AANT-WIELEN")
    public void setAANTWIELEN(String aANTWIELEN) {
        this.aANTWIELEN = aANTWIELEN;
    }

    @JsonProperty("AFW-MAX-SNELH")
    public Object getAFWMAXSNELH() {
        return aFWMAXSNELH;
    }

    @JsonProperty("AFW-MAX-SNELH")
    public void setAFWMAXSNELH(Object aFWMAXSNELH) {
        this.aFWMAXSNELH = aFWMAXSNELH;
    }

    @JsonProperty("MAS-BEDR-KL-MIN")
    public Object getMASBEDRKLMIN() {
        return mASBEDRKLMIN;
    }

    @JsonProperty("MAS-BEDR-KL-MIN")
    public void setMASBEDRKLMIN(Object mASBEDRKLMIN) {
        this.mASBEDRKLMIN = mASBEDRKLMIN;
    }

    @JsonProperty("MAS-BEDR-KL-MAX")
    public Object getMASBEDRKLMAX() {
        return mASBEDRKLMAX;
    }

    @JsonProperty("MAS-BEDR-KL-MAX")
    public void setMASBEDRKLMAX(Object mASBEDRKLMAX) {
        this.mASBEDRKLMAX = mASBEDRKLMAX;
    }

    @JsonProperty("MAX-MAS-T-MAX")
    public Object getMAXMASTMAX() {
        return mAXMASTMAX;
    }

    @JsonProperty("MAX-MAS-T-MAX")
    public void setMAXMASTMAX(Object mAXMASTMAX) {
        this.mAXMASTMAX = mAXMASTMAX;
    }

    @JsonProperty("MAX-MAS-T-MIN")
    public Object getMAXMASTMIN() {
        return mAXMASTMIN;
    }

    @JsonProperty("MAX-MAS-T-MIN")
    public void setMAXMASTMIN(Object mAXMASTMIN) {
        this.mAXMASTMIN = mAXMASTMIN;
    }

    @JsonProperty("SUB-CAT-NL")
    public Object getSUBCATNL() {
        return sUBCATNL;
    }

    @JsonProperty("SUB-CAT-NL")
    public void setSUBCATNL(Object sUBCATNL) {
        this.sUBCATNL = sUBCATNL;
    }

    @JsonProperty("SUB-CAT-NL-OMS")
    public Object getSUBCATNLOMS() {
        return sUBCATNLOMS;
    }

    @JsonProperty("SUB-CAT-NL-OMS")
    public void setSUBCATNLOMS(Object sUBCATNLOMS) {
        this.sUBCATNLOMS = sUBCATNLOMS;
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
