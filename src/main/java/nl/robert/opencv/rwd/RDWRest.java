package nl.robert.opencv.rwd;

import java.io.FileInputStream;
// // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
import java.net.URI;
import java.util.Properties;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

import nl.robert.opencv.rwd.model.RDWResponse;

public class RDWRest 
{
     
    public String getRDWInfo(String licencePlate) {
   	 HttpClient httpclient = HttpClients.createDefault();
   	 
        try
        {
            URIBuilder builder = new URIBuilder("https://api.rdw.nl/ovi-a/version=1");

            Properties appProps = new Properties();
            appProps.load(RDWRest.class.getClassLoader().getResourceAsStream("credentials.properties"));
            System.out.println(appProps.getProperty("rdwkey"));
            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);
            request.setHeader("Content-Type", "application/json");
            request.setHeader("Ocp-Apim-Subscription-Key", appProps.getProperty("rdwkey"));
            
            //rdw wants the licence plate without the - so remove them from the string.
            licencePlate = licencePlate.replace("-", "");
            // Request body
            StringEntity reqEntity = new StringEntity("{ \"KENTEKEN\": \"" + licencePlate + "\" }");
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            ObjectMapper mapper = new ObjectMapper();
            RDWResponse result = mapper.readValue(entity.getContent(), RDWResponse.class);
           
           return result.getOPENBVRTGINFO().getVRTGSTANDGEG().getMERKBESCHR() + " " + result.getOPENBVRTGINFO().getVRTGSTANDGEG().getTYPEBESCHRVTG();
        }
        catch (Exception e)
        {
            return "";
        }
   }
}
