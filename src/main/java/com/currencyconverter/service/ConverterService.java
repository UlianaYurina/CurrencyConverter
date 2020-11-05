package com.currencyconverter.service;


import com.currencyconverter.dto.TransferDto;

public interface ConverterService {
    TransferDto getExchangeRate(TransferDto transferDto, String city);

}
