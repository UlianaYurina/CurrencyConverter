package com.currencyconverter.CurrencyConverter.service;


import com.currencyconverter.CurrencyConverter.dto.TransferDto;

public interface ConverterService {
    String getCourses(); //Получить текущий курс. Что в качестве параметра?
    String makeTransfer(TransferDto transferDto);
}
