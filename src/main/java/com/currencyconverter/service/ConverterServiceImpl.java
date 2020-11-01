package com.currencyconverter.service;

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.cbr.ExchangeRateDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//конвертация по курсу из валюты отправителяв валюту получателя

@Service
@Slf4j
public class ConverterServiceImpl implements ConverterService {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MarsWeatherService marsWeatherService;

    public String getExchangeRate(TransferDto transferDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<ExchangeRateDto> exchangeRate =
                restTemplate.exchange("https://www.cbr-xml-daily.ru/daily_json.js", HttpMethod.GET, entity, ExchangeRateDto.class, 1);

        ExchangeRateDto rateBody = exchangeRate.getBody();
        return String.valueOf(rateBody != null ? rateBody.getValute().getEUR().getValue() : "null");
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
