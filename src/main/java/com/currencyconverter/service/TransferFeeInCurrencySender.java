package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;

public interface TransferFeeInCurrencySender {

    Double getFeeInCurSender(CurrencyCode codeSender, String city);


}
