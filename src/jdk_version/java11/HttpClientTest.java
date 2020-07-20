package jdk_version.java11;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @description:
 * @author:zhaojq
 */
public class HttpClientTest {
    @Test
    public void t1() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://javastack.cn"))
                .GET()
                .build();
        var client = HttpClient.newHttpClient();
        // 同步
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        // 异步
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
    }
}
