package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface TransferFeeInCurrencySender {

    Double getFeeInCurSender(CurrencyCode codeSender, String city);


}
