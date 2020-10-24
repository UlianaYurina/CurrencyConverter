package com.currencyconverter.service;


import com.currencyconverter.dto.TransferDto;

public interface ConverterService {
    String getCourses(); //Получить текущий курс. Что в качестве параметра?
    String makeTransfer(TransferDto transferDto);
}
