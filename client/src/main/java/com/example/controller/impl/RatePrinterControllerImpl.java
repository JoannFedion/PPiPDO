package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.controller.RatePrinterController;
import com.example.service.RatePrinterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class RatePrinterControllerImpl implements RatePrinterController {
    @Autowired
    private RatePrinterService ratePrinterService;

    @Override
    public void ratePrint() {
        ratePrinterService.printRate();
    }
}
