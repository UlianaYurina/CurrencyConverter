package com.currencyconverter.facade;

import com.currencyconverter.dto.TransferDto;

public interface TransferFacade {
    TransferDto makeExchange(TransferDto transferDto, String city);
}
