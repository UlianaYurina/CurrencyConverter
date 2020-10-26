package com.currencyconverter.service;


import com.currencyconverter.dto.TransferDto;

public interface ConverterService {
    String getExchangeRate(); //Получить текущий курс. Что в качестве параметра?


    String getWeatherOnMars(); //Получить реальную погоду на Марсе.


    String getGoldPrice();  //Курс золота


    String makeTransfer(TransferDto transferDto);
}
