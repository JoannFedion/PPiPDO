package com.example.controller.impl;

import com.example.controller.CurrencyRateProviderController;
import com.example.service.CurrencyRateProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencyRate")
public class CurrencyRateProviderControllerImpl implements CurrencyRateProviderController {
    @Autowired
    private CurrencyRateProviderService currencyRateProviderService;
    @Override
    public int getCurrencyRate() {
        return currencyRateProviderService.getCurrencyRate();
    }
}
