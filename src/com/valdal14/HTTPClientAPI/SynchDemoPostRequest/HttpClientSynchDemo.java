package com.valdal14.HTTPClientAPI.SynchDemoPostRequest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class HttpClientSynchDemo {

    private static final String JSONTOPOST = """
            {
                "userId": 1014,
                "id": 8,
                "title": "test",
                "body": "dignissimos aperiam dolorem"
              }
            """;

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        // create a client
        HttpClient client = HttpClient.newHttpClient();
        // Create a request
        /**
         * For a POST we need a BodyPublishers And we also need to set the Header
         */
        HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/posts/")).POST(HttpRequest.BodyPublishers.ofString(HttpClientSynchDemo.JSONTOPOST))
                .headers("Content-Type", "application/json").build();
        // handle the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("--- HTTP RESPONSE ---");
        System.out.println(response.statusCode());
        System.out.println(response.body());
        System.out.println("--- RESPONSE HEADER ---");
        HttpHeaders headers = response.headers();
        Map<String, List<String>> headerMap = headers.map();
        for (Map.Entry<String, List<String>> map: headerMap.entrySet()) {
            System.out.printf("Key: %s - Value: %s \n", map.getKey(), map.getValue());
            System.out.println("---------------------------------------------------");
        }
    }
}
