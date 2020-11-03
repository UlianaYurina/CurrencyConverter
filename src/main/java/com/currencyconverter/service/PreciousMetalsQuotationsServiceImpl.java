package com.currencyconverter.service;

import com.currencyconverter.dto.cbrPreciousMetals.MetalsQuotations;
import com.currencyconverter.dto.earth.weather.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class PreciousMetalsQuotationsServiceImpl implements PreciousMetalsQuotationsService {

    @Autowired
    private RestTemplate restTemplate;

    public String getMetalsPrice() {
        Date dateTo = new Date();
        Date dateFrom = new Date(dateTo.getTime() - 24 * 3600 * 1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateToStr = dateFormat.format(dateTo);
        String dateFromStr = dateFormat.format(dateFrom);

        //"http://www.cbr.ru/scripts/xml_metall.asp?date_req1=20/10/2020&date_req2=01/11/2020",

        UriComponentsBuilder metPriceBuild =
                UriComponentsBuilder
                        .fromUriString("http://www.cbr.ru/scripts/xml_metall.asp")
                        .queryParam("date_req1", dateFromStr)
                        .queryParam("date_req2", dateToStr);

        ResponseEntity<String> w = restTemplate
                .getForEntity("http://www.cbr.ru/scripts/xml_metall.asp?date_req1=20/10/2020&date_req2=01/11/2020",
                        String.class);
        System.out.println(w);




        return null;
    }
}
