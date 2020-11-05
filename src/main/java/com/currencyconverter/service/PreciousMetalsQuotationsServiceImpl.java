package com.currencyconverter.service;

import com.currencyconverter.dto.cbrPreciousMetalsJson.PrecForMet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//https://metals-api.com/api/latest?access_key=4jzakw1p8152zn1eu3njcfb94mv80ed24q0d0ttuemrbe92cy0fo5498d1fm

@Service
public class PreciousMetalsQuotationsServiceImpl implements PreciousMetalsQuotationsService {

    @Autowired
    private RestTemplate restTemplate;

    public Double getMetalsPrice() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<PrecForMet> exchangeRateForMet =
                restTemplate.exchange("https://metals-api.com/api/latest?" +
                                "access_key=4jzakw1p8152zn1eu3njcfb94mv80ed24q0d0ttuemrbe92cy0fo5498d1fm",
                        HttpMethod.GET, entity, PrecForMet.class, 1);


        PrecForMet rateBody = exchangeRateForMet.getBody();
        //try catch
        double rateGoldRubForGramm = 1 / (rateBody.getRates().getXAU() * 31.1034768) * rateBody.getRates().getRUB();

        return rateGoldRubForGramm;

//        Date dateTo = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String dateToStr = dateFormat.format(dateTo);
//
//        //"http://www.cbr.ru/scripts/xml_metall.asp?date_req1=20/10/2020&date_req2=01/11/2020",
//
//        String metPriceBuild =
//                UriComponentsBuilder
//                        .fromUriString("http://www.cbr.ru/scripts/xml_metall.asp")
//                        .queryParam("date_req1", dateToStr)
//                        .queryParam("date_req2", dateToStr).toUriString();
//



    }
}
