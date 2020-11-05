package com.currencyconverter.facade;


import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.TransferResult;
import com.currencyconverter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferFacadeImpl implements TransferFacade {
    @Autowired
    private ConverterService converterService;

    public TransferDto makeExchange(TransferDto transferDto, String city) {

        return converterService.getExchangeRate(transferDto, city);
    }
}
