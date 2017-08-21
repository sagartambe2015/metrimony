package devopsbuddy.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import devopsbuddy.web.controllers.ContactController;

public class RestTestAppplication {
	private static Logger logger = LoggerFactory.getLogger(RestTestAppplication.class);

    public static void main(String args[]) {
    	
    	/*
       "body": {
        "pickup_lat": 12.9490936,
        "pickup_lng": 77.6443056,
        "drop_lat": 12.972934,
        "drop_lng": 77.722302,
        "pickup_mode": "NOW",
        "category": "prime"
      }
          
      "headers": {
        "Authorization": "Bearer baac2cfc6be4489ab044f7d98bff24bf",
        "X-APP-TOKEN": "6a53bcbe222c490196e4b9f87ba9148c",
        "Content-Type": "application/json"
      }*/
    
        RestTemplate restTemplate = new RestTemplate();
        //String url = "https://sandbox-t1.olacabs.com/oauth2/authorize?response_type=token&client_id=MmNlNDA0M2QtMDBjMS00OWJlLThmNTUtMWIzMDVkNzdmNGJk&redirect_uri=http://localhost/ola/tokens&scope=profile%20booking&state=state123";
        String url = "https://devapi.olacabs.com/v1/bookings/create";
        /*String body = 
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        entity.
        
        ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        
        System.out.println(result);*/
        
        
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("pickup_lat", "12.9490936");
        params.put("pickup_lng", "77.6443056");
        params.put("drop_lat", "12.972934");
        params.put("drop_lng", "77.722302");
        params.put("pickup_mode", "NOW");
        params.put("category", "prime");
        
       /* HttpRequest req = new HttpRe
         
        
        //String result = restTemplate.getForObject(url, String.class, params);
        ResponseEntity<String> response = postForEntity(url,
                Object request,
                String.class,
                Object... uriVariables)
         
        System.out.println(result);*/
        
        //restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", "", "");
        
    }
    
    private static void getEmployees()
    {
        final String uri = "https://devapi.olacabs.com/v1/bookings/create";
         
        RestTemplate restTemplate = new RestTemplate();
         
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.put("Authorization", Arrays.asList("MmNlNDA0M2QtMDBjMS00OWJlLThmNTUtMWIzMDVkNzdmNGJk"));
        headers.put("X-APP-TOKEN", Arrays.asList("6a53bcbe222c490196e4b9f87ba9148c"));
        headers.put("Content-Type", Arrays.asList("application/json"));
        
        Map body = new HashMap();
        body.put("pickup_lat", 12.9490936);
        body.put("pickup_lng", 77.6443056);
        body.put("drop_lat", 12.972934);
        body.put("drop_lng", 77.722302);
        body.put("pickup_mode", "NOW");
        body.put("category", "prime");
        
        
        //HttpEntity<String> entity = new HttpEntity<Map>(body, headers);
        
        
        
         
        //ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
         
        //System.out.println(result);
    }
}
