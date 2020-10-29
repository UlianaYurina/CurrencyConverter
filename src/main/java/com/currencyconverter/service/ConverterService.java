package com.currencyconverter.service;


import com.currencyconverter.dto.TransferDto;

public interface ConverterService {
    String getExchangeRate(TransferDto transferDto); //Получить текущий курс. Что в качестве параметра?


    double getWeatherOnMars(String sol); //Получить реальную погоду на Марсе.


    String getGoldPrice();  //Курс золота


    String makeTransfer(TransferDto transferDto);
}
