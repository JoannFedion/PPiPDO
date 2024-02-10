package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
public class CurrencyRateProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyRateProviderApplication.class, args);
    }
}
