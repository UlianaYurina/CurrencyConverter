package com.currencyconverter.dto;

import lombok.Data;



// Обращение от второго сервиса для конвертации,
@Data
public class TransferDto {

    private CurrencyCode currencyCodeSender;
    private CurrencyCode currencyCodeReceiver;
    private Double transferAmountInCurrencySender;



    public CurrencyCode getCurrencyCodeSender() {
        return currencyCodeSender;
    }

    public void setCurrencyCodeSender(CurrencyCode currencyCodeSender) {
        this.currencyCodeSender = currencyCodeSender;
    }

    public CurrencyCode getCurrencyCodeReceiver() {
        return currencyCodeReceiver;
    }

    public void setCurrencyCodeReceiver(CurrencyCode currencyCodeReceiver) {
        this.currencyCodeReceiver = currencyCodeReceiver;
    }

    public Double getTransferAmountInCurrencySender() {
        return transferAmountInCurrencySender;
    }

    public void setTransferAmountInCurrencySender(Double transferAmountInCurrencySender) {
        this.transferAmountInCurrencySender = transferAmountInCurrencySender;
    }


}
