package com.currencyconverter.service;

//http://www.cbr.ru/scripts/XML_daily.asp?

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.cbr.ExchangeRateDto;
import com.currencyconverter.dto.cbr.Valute;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

//конвертация по курсу из валюты отправителяв валюту получателя

@Service
public class ConverterServiceImpl implements ConverterService {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    public String getCourses() {

        ResponseEntity<String> exchangeRate =
                restTemplate.getForEntity("http://www.cbr.ru/scripts/XML_daily.asp?", String.class, 1);
        String xml = exchangeRate.getBody();
        ExchangeRateDto dto = null;
        try {
            dto = objectMapper.readValue(xml, ExchangeRateDto.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        Valute[] valutes = dto.getValCurs().getValute();

        String usdValue;
        String eurValue;

        for (Valute v : valutes) {
            if (v.getCharCode().equals("USD")) {
                usdValue = v.getValue();
            }
            if (v.getCharCode().equals("EUR")) {
                eurValue = v.getValue();
            }
        }
        System.out.println(Arrays.toString(dto.getValCurs().getValute()));
        //достать курс валют по url
        return null; //вернуть json, причем оставить только рудли, и доллары
    }

    public String makeTransfer(TransferDto transferDto) {


        return null;
    }
}
