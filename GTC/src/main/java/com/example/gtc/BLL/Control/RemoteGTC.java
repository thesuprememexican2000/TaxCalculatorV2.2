package com.example.gtc.BLL.Control;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RemoteGTC implements ITaxCalculator{
    public RemoteGTC(){}

    @Override
    public double getTax(double amount){
        //Request: http://localhost:13001/ctc/api/tax?amount=1000
        String uri = "http://localhost:13000/gtc/api/tax?amount="+amount;
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return Double.valueOf(response.body());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return 0.0d;
    }
}