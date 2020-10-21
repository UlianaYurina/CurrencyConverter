package com.currencyconverter.CurrencyConverter.dto;

import lombok.Data;

// Обращение от второго сервиса для конвертации,
@Data
public class TransferDto {

    private CurrencyCode currencyCodeSender;
    private CurrencyCode currencyCodeReceiver;
    private Double transferAmountInCurrencySender;

    private Double transferResultInCurrencyReceiver;
    private Double transferFeeInCurrencySender;

}
