package com.currencyconverter.service;


import com.currencyconverter.dto.TransferDto;

public interface ConverterService {
    Double getExchangeRate(TransferDto transferDto);

}
