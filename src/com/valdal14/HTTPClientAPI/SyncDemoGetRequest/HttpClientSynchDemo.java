package com.valdal14.HTTPClientAPI.SyncDemoGetRequest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSynchDemo {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        // Create the HttpClient Object
        HttpClient client = HttpClient.newHttpClient();
        // Create the HttpRequest Object
        HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/todos/1")).GET().build();
        // Send a request
        /**
         * We need to provide with a requet and a BodyHandlers
         */
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        // Handle the response
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
