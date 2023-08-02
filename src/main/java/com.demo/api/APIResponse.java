package com.demo.api;

import com.demo.endpoint.APIPath;
import com.demo.mapper.MapperToPojo;
import com.demo.pojo.WeatherData;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class APIResponse {
   public static  WeatherData getAPIResponse() {
       String apiUrl = APIPath.WEATHER_GET_API.getApiPath();

       try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
           HttpGet httpGet = new HttpGet(apiUrl);

           HttpResponse response = httpClient.execute(httpGet);
           int statusCode = response.getStatusLine().getStatusCode();

           if (statusCode == 200) {
               HttpEntity entity = response.getEntity();
               String responseBody = EntityUtils.toString(entity);
              return  MapperToPojo.getInstance().jsonToPojo(responseBody, com.demo.pojo.WeatherData.class);
           } else {
               System.out.println("Failed to get API response. Status code: " + statusCode);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       return null;
   }
}
