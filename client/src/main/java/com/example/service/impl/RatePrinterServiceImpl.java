package com.example.service.impl;

import com.example.entity.Exchange;
import com.example.repository.ExchangeRateRepository;
import com.example.service.RatePrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RatePrinterServiceImpl implements RatePrinterService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    @Scheduled(fixedDelay = 5000)
    @Override
    public void printRate() {
        Exchange exchange = exchangeRateRepository.findById(1).orElseThrow(
                () -> new RuntimeException("Обменный курс не найден")
        );
        System.out.println("get response from db" + ". Current rate is " + exchange.getExchangeRate());

    }
}
