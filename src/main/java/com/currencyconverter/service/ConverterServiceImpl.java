package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.cbr.ExchangeRateDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ConverterServiceImpl implements ConverterService {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MarsWeatherService marsWeatherService;
    @Autowired
    private CreationNewCurrencyService creationNewCurrencyService;

    public TransferDto getExchangeRate(TransferDto transferDto, String city) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<ExchangeRateDto> exchangeRate =
                restTemplate.exchange("https://www.cbr-xml-daily.ru/daily_json.js",
                        HttpMethod.GET, entity, ExchangeRateDto.class, 1);
        System.out.println(exchangeRate.getBody().getValute().getUSD());


        ExchangeRateDto rateBody = exchangeRate.getBody();
        double priceInCurSenderFor1Rub = 0.0;
        double priceInCurReceiverFor1Rub = 0.0;

        if (transferDto.getCurrencyCodeSender().equals(CurrencyCode.EUR)) {
            priceInCurSenderFor1Rub = rateBody.getValute().getEUR().getValue();
        }
        if (transferDto.getCurrencyCodeSender().equals(CurrencyCode.USD)) {
            priceInCurSenderFor1Rub = rateBody.getValute().getUSD().getValue();
        }
        if (transferDto.getCurrencyCodeSender().equals(CurrencyCode.GBP)) {
            priceInCurSenderFor1Rub = rateBody.getValute().getGBP().getValue();
        }
        if (transferDto.getCurrencyCodeSender().equals(CurrencyCode.MAR)) {
            priceInCurSenderFor1Rub = creationNewCurrencyService.getNewCurrency(city);
        }

        if (transferDto.getCurrencyCodeReceiver().equals(CurrencyCode.EUR)) {
            priceInCurReceiverFor1Rub = rateBody.getValute().getEUR().getValue();
        }
        if (transferDto.getCurrencyCodeReceiver().equals(CurrencyCode.USD)) {
            priceInCurReceiverFor1Rub = rateBody.getValute().getUSD().getValue();
        }
        if (transferDto.getCurrencyCodeReceiver().equals(CurrencyCode.GBP)) {
            priceInCurReceiverFor1Rub = rateBody.getValute().getGBP().getValue();
        }
        if (transferDto.getCurrencyCodeReceiver().equals(CurrencyCode.MAR)) {
            priceInCurReceiverFor1Rub = creationNewCurrencyService.getNewCurrency(city);
        }

        transferDto.setTransferAmountInCurrencyReceiver(priceInCurSenderFor1Rub /
                priceInCurReceiverFor1Rub * transferDto.getTransferAmountInCurrencySender());

        return transferDto;
    }



    public double getWeatherOnMars(String sol) {
        double marsTemperature = 0.0;
        try {
           marsTemperature = marsWeatherService.getSolTemperature(sol);
        } catch (JSONException e) {
            log.error(e.getLocalizedMessage());
        }
        return marsTemperature;
    }

}
