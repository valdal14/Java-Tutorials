package com.valdal14.HTTPClientAPI;

/**
 *  HTTP CLIENT API ----------------------------------------------------------------------------------------------
 *      -> HTTP/2 Client got permanent in Java 11
 *      -> We can do any sort of HTTP requests with it
 *      -> Before we have to use HttpUrlConnection class
 *          -> Only supports HTTP 1
 *          -> Slow since one call and the time
 *          -> text only
 *          -> Synch and IO Blocking only 1 call at the time (no ajax call possible)
 *      -> I created a new module-info.java in this project since we need to require the java.net.http
 *
 *          module httpClientDemo {
 *              requires java.net.http;
 *          }
 *
 *      -> Below the steps we need to performer
 *          --> Create HttpClient Object
 *              --> We can use either HttpClient.newBuilder or newHttpClient
 *                  --> Using HttpClient.newBuilder we need to specify everything manually
 *          --> Create HttpRequest Object
 *          --> Send the Request
 *          --> Process the response
 *
 *      -> The Asynch version start from the response Object
 *          -> The sendAsync() takes a request, a BodyHandlers and returns CompletableFeature<HttpResponse<T>>
 *          -> CompletableFuture<HttpResponse<String>> completableFuture = client.sendAsync(request, BodyHandlers.ofString());
 *
 *  --------------------------------------------------------------------------------------------------------------
 */
public class HTTPClientAPI {
}
