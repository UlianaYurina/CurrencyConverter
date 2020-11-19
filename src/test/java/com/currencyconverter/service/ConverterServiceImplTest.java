package com.currencyconverter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConverterServiceImplTest {

    @Autowired
    private CreationNewCurrencyService creationNewCurrencyService;
    @Autowired
    private TransferFeeInCurrencySenderImpl transferFeeInCurrencySender;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void getExchangeRate() {


    }

    @Test
    void getRateForSender() {
    }
}