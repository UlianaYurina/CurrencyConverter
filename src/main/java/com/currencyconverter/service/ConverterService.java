package com.currencyconverter.service;


import com.currencyconverter.dto.CurrencyCode;
import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.TransferResult;

public interface ConverterService {
    TransferResult getExchangeRate(TransferDto transferDto, String city);
    Double getRateForSender(CurrencyCode codeSender, String city);

}
