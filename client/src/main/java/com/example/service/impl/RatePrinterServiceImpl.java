package com.example.service.impl;

import com.example.RestRequest;
import com.example.service.RatePrinterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RatePrinterServiceImpl implements RatePrinterService {
    @Value("${currencyRateProvider.url}")
    private String server;

    @Value("${currencyRateProvider.name}")
    private String serverName;

    @Override
    public void printRate() {
        while (true) {
            ResponseEntity<String> response = RestRequest.makeGETRequestTo(server, String.class);
            System.out.println("get response from " + serverName + ". Current rate is " + response.getBody());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
