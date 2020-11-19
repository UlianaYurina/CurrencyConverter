package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransferFeeInCurrencySenderImplTest {

    @MockBean
    private ConverterService converterService;

    private static final Double feeInMar = 5.0;
    private static final String city = "Moskow";
    private static final CurrencyCode codeSender = CurrencyCode.USD;


    @Test
    void getFeeInCurSender(CurrencyCode codeSender, String city) {

    }
}