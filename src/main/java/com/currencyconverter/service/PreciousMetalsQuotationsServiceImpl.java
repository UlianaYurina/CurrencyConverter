package com.currencyconverter.service;

import com.currencyconverter.dto.cbrPreciousMetalsJson.PrecForMet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PreciousMetalsQuotationsServiceImpl implements PreciousMetalsQuotationsService {

    @Autowired
    private RestTemplate restTemplate;

    public Double getGoldPriceInRub() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<PrecForMet> exchangeRateForMet =
                restTemplate.exchange("https://metals-api.com/api/latest?%20access_key=" +
                                "7pr699z7hga4ic7i61cpkidv3bjvgj7ikro09dnp726wnzu0nkh90d6kxqrh",
                        HttpMethod.GET, entity, PrecForMet.class, 1);

        PrecForMet rateBody = exchangeRateForMet.getBody();

        Double rateGoldPriceRubForGramm = 1 / (rateBody.getRates().getXAU() * 31.1034768) *
                                            rateBody.getRates().getRUB();

        return rateGoldPriceRubForGramm;

    }
}
