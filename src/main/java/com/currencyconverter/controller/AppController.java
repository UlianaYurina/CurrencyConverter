package com.currencyconverter.controller;

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.TransferResult;
import com.currencyconverter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private ConverterService converterService;

    @PostMapping("/exchange")
    public void getExchange (@RequestBody TransferDto transferDto) {
        converterService.getExchangeRate();
    }
}
