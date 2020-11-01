package com.currencyconverter.service;


import com.currencyconverter.dto.TransferDto;

public interface ConverterService {
    String getExchangeRate(TransferDto transferDto);

}
