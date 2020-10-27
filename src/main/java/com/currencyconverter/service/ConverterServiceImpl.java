package com.currencyconverter.service;

//http://www.cbr.ru/scripts/XML_daily.asp?



//https://www.cbr-xml-daily.ru/daily_json.js

import com.ctc.wstx.shaded.msv.org_jp_gr_xml.xml.UXML;
import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.cbr.ExchangeRateDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;
import lombok.SneakyThrows;
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

    public String getExchangeRate() {
        ResponseEntity<ExchangeRateDto> exchangeRate =
                restTemplate.getForEntity("https://www.cbr-xml-daily.ru/daily_json.js", ExchangeRateDto.class);

//        System.out.println(exchangeRate.toString());


//        ResponseEntity<String> exchangeRate =
//                restTemplate.getForEntity("http://www.cbr.ru/scripts/XML_daily.asp?", String.class, 1);
//        String xml = exchangeRate.getBody();
//        ExchangeRateDto dto = null;
//        try {
//            dto = objectMapper.readValue(xml, ExchangeRateDto.class);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//

        //достать курс валют по url
        return null; //вернуть json, причем оставить только рудли, и доллары
    }

    public String getWeatherOnMars() {


        return null;
    }
    public String getGoldPrice() {


        return null;
    }
    public String makeTransfer(TransferDto transferDto) {


        return null;
    }
}
