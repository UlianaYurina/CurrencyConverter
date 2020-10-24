package com.currencyconverter.dto;

import lombok.Data;

@Data
public class TransferResult {

    private Double transferResultInCurrencyReceiver;
    private Double transferFeeInCurrencySender;

}
