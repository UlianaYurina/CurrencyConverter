package com.currencyconverter.CurrencyConverter.dto;

import lombok.Data;

// Обращение от второго сервиса для конвертации,
@Data
public class TransferDto {
    private CurrencyCode accCurrencySender;
    private CurrencyCode accCurrencyReceiver;
    private Double transferAmountInCurrencySender;
}
