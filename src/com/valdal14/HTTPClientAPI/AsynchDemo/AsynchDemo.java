package com.valdal14.HTTPClientAPI.AsynchDemo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchDemo {

    private static final String JSONTOPOST = """
            {
                "userId": 1014,
                "id": 8,
                "title": "test",
                "body": "dignissimos aperiam dolorem"
              }
            """;

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {

        // create a client
        HttpClient client = HttpClient.newHttpClient();
        // Create a request
        /**
         * For a POST we need a BodyPublishers And we also need to set the Header
         */
        HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/posts/")).POST(BodyPublishers.ofString(AsynchDemo.JSONTOPOST))
                .headers("Content-Type", "application/json").build();

        // The sendAsync() takes a request, a BodyHandlers and returns CompletableFeature<HttpResponse<T>>
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());
        // handle the CompletableFeature<HttpResponse<T>>
        /**
         * response.thenApply() takes a Function but we can also use HttpResponse::body and the get() to return a String
         */
        String body = response.thenApply(HttpResponse::body).get();

        System.out.println("--- HTTP RESPONSE ---");
        System.out.println(body);


    }
}
