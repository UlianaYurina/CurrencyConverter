package com.currencyconverter.dto;

import lombok.Data;

@Data
public class TransferResult {

    private Double transferAmountInCurrencySender;
    private Double transferAmountInCurrencyReceiver;
    private Double transferFeeInCurrencySender;
}
