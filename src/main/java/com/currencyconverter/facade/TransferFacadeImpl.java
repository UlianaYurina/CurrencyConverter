package com.currencyconverter.facade;


import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.TransferResult;
import com.currencyconverter.service.ConverterService;
import com.currencyconverter.service.CreationNewCurrencyService;
import com.currencyconverter.service.TransferFeeInCurrencySender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferFacadeImpl implements TransferFacade {
    @Autowired
    private CreationNewCurrencyService creationNewCurrencyService;

    @Autowired
    private ConverterService converterService;

    @Autowired
    private TransferFeeInCurrencySender transferFeeInCurrencySender;

    public Double createMarCurrency(String city) {
        return creationNewCurrencyService.getNewCurrency(city);
    }

    public TransferResult makeExchange(TransferDto transferDto, String city) {

        return converterService.getExchangeRate(transferDto, city);
    }
}
