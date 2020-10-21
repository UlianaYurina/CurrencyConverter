package com.currencyconverter.CurrencyConverter.service;


import com.currencyconverter.CurrencyConverter.dto.TransferDto;

public interface ConverterService {
    String makeTransfer(TransferDto transferDto);
}
