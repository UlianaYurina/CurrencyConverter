package com.currencyconverter.service;

import com.currencyconverter.dto.cbr.ExchangeRateDto;
import com.currencyconverter.dto.cbrPreciousMetals.MetalsQuotations;
import com.fasterxml.jackson.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class PreciousMetalsQuotationsServiceImpl implements PreciousMetalsQuotationsService {


    XmlMapper xmlMapper = new XmlMapper();

    @Autowired
    private RestTemplate restTemplate;

    public String getMetalsPrice() {

        ResponseEntity<String> metallEx =
                restTemplate.getForEntity("http://www.cbr.ru/scripts/xml_metall.asp?date_req1=31/10/2020&date_req2=01/11/2020", String.class);
                    System.out.println(metallEx.getBody());

        return null;
    }
}
