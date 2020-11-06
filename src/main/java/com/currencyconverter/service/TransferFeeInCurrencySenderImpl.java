package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferFeeInCurrencySenderImpl implements TransferFeeInCurrencySender {

    private final int feeInMar = 5;

    @Autowired
    private CreationNewCurrencyService creationCreationNewCurrencyService;

    @Autowired
    private ConverterService converterService;

    public Double getFeeInCurSender(CurrencyCode codeSender, String city) {

        return converterService.getRateForSender(codeSender, city) * feeInMar;
    }


}
