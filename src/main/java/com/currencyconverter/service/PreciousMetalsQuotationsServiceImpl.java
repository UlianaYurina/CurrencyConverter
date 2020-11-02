package com.currencyconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class PreciousMetalsQuotationsServiceImpl implements PreciousMetalsQuotationsService {

    @Autowired
    private RestTemplate restTemplate;

    public String getMetalsPrice() {

        //"http://www.cbr.ru/scripts/xml_metall.asp?date_req1=20/10/2020&date_req2=01/11/2020",


        return null;
    }
}
