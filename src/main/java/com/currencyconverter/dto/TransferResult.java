package com.currencyconverter.dto;

public class TransferResult {

//    private CurrencyCode currencyCodeSender;
//    private CurrencyCode currencyCodeReceiver;
    private Double transferAmountInCurrencySender;
    private Double transferAmountInCurrencyReceiver;
    private Double transferFeeInCurrencySender;

//    public CurrencyCode getCurrencyCodeSender() {
//        return currencyCodeSender;
//    }

//    public void setCurrencyCodeSender(CurrencyCode currencyCodeSender) {
//        this.currencyCodeSender = currencyCodeSender;
//    }

//    public CurrencyCode getCurrencyCodeReceiver() {
//        return currencyCodeReceiver;
//    }

//    public void setCurrencyCodeReceiver(CurrencyCode currencyCodeReceiver) {
//        this.currencyCodeReceiver = currencyCodeReceiver;
//    }

    public Double getTransferAmountInCurrencySender() {
        return transferAmountInCurrencySender;
    }

    public void setTransferAmountInCurrencySender(Double transferAmountInCurrencySender) {
        this.transferAmountInCurrencySender = transferAmountInCurrencySender;
    }

    public Double getTransferAmountInCurrencyReceiver() {
        return transferAmountInCurrencyReceiver;
    }

    public void setTransferAmountInCurrencyReceiver(Double transferAmountInCurrencyReceiver) {
        this.transferAmountInCurrencyReceiver = transferAmountInCurrencyReceiver;
    }

    public Double getTransferFeeInCurrencySender() {
        return transferFeeInCurrencySender;
    }

    public void setTransferFeeInCurrencySender(Double transferFeeInCurrencySender) {
        this.transferFeeInCurrencySender = transferFeeInCurrencySender;
    }
}
