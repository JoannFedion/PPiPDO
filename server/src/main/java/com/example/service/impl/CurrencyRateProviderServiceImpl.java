package com.example.service.impl;

import com.example.entity.Exchange;
import com.example.repository.ExchangeRateRepository;
import com.example.service.CurrencyRateProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CurrencyRateProviderServiceImpl implements CurrencyRateProviderService {

    private final Random random = new Random();

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;
    @Override
    @Scheduled(fixedDelay = 5000)
    public void setExchangeRate() {
        Exchange exchange = exchangeRateRepository.findById(1).orElseThrow(
                () -> new RuntimeException("Обменный курс не найден")
        );
        int newRate = random.nextInt(60,100);
        exchange.setExchangeRate(newRate);
        exchangeRateRepository.save(exchange);
        System.out.println("Установлен новый курс: " + newRate);
    }
}
