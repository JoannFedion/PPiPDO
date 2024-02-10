package com.example.service.impl;

import com.example.service.CurrencyRateProviderService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CurrencyRateProviderServiceImpl implements CurrencyRateProviderService {

    private final Random randomValue = new Random();
    @Override
    public int getCurrencyRate() {
        return randomValue.nextInt(70, 90);
    }
}
