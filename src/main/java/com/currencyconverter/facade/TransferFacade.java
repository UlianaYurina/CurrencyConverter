package com.currencyconverter.facade;

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.TransferResult;
import com.currencyconverter.dto.cbr.MAR;

public interface TransferFacade {

    Double createMarCurrency(String city);
    TransferResult makeExchange(TransferDto transferDto, String city);
}
