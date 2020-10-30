package nl.robert.opencv.rwd;

// // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
import java.net.URI;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import nl.robert.opencv.rwd.model.RDWResponse;

public class RDWRest 
{
     
    public String getRDWInfo(String licencePlate) {
    	HttpClient httpclient = HttpClients.createDefault();
        try
        {
        	//rdw wants the licence plate without the - so remove them and uppercase it to be sure.
        	licencePlate = licencePlate.replace("-", "").toUpperCase();
            URIBuilder builder = new URIBuilder("https://opendata.rdw.nl/resource/m9d7-ebf2.json?kenteken=" + licencePlate);

            URI uri = builder.build();
           
            HttpGet request = new HttpGet(uri);
            request.setHeader("Content-Type", "application/json");
            HttpResponse response = httpclient.execute(request);
            
            ObjectMapper mapper = new ObjectMapper();
            String json = EntityUtils.toString(response.getEntity(), "UTF-8");
        	List<RDWResponse> listCar = mapper.readValue(json, new TypeReference<List<RDWResponse>>(){});
        	
			if (!listCar.isEmpty()) {
				RDWResponse result = listCar.get(0);
				return result.getMerk() + " " + result.getHandelsbenaming();
			} else {
				return "Car not in RDW database";
			}
			
           
        		   //result.getOPENBVRTGINFO().getVRTGSTANDGEG().getMERKBESCHR() + " " + result.getOPENBVRTGINFO().getVRTGSTANDGEG().getTYPEBESCHRVTG();
        }
        catch (Exception e)
        {
        	e.printStackTrace();
            return "";
        }
   }
}
