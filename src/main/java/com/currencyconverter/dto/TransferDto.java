package com.currencyconverter.dto;

import lombok.Data;
@Data
public class TransferDto {

    private CurrencyCode currencyCodeSender;
    private CurrencyCode currencyCodeReceiver;
    private Double transferAmountInCurrencySender;

}
