package com;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestRestClient {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 6; i++) {
                CloseableHttpClient client = HttpClients.createDefault();
                HttpGet httpGet = new HttpGet("http://localhost:9000/router");
                CloseableHttpResponse response = client.execute(httpGet);
                System.out.println(EntityUtils.toString(response.getEntity()));
            }
        }catch (Exception e){

        }
    }
}
