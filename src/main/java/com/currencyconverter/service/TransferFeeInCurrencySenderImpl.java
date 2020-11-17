package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferFeeInCurrencySenderImpl implements TransferFeeInCurrencySender {

    private static final Double feeInMar = 5.0;

    @Autowired
    private CreationNewCurrencyService creationCreationNewCurrencyService;

    @Autowired
    private ConverterService converterService;

    public Double getFeeInCurSender(CurrencyCode codeSender, String city) {
        if (codeSender.equals(CurrencyCode.MAR)) {
            return feeInMar;
        }

        return (converterService.getRateForSender(codeSender, city) * feeInMar);
    }


}
