package com.currencyconverter.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PreciousMetalsQuotationsServiceImplTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void getGoldPriceInRub() {


    }
}