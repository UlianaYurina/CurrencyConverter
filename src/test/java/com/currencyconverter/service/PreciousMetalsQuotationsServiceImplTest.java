package com.currencyconverter.service;

import com.currencyconverter.dto.cbr.metals.json.PrecForMet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@SpringBootTest
class PreciousMetalsQuotationsServiceImplTest {

    @Autowired
    private RestTemplate restTemplate;

    private  static final PrecForMet expectedPrecForMet = new PrecForMet();

    @BeforeAll
    static void setExpectedPrecForMetall() {
        expectedPrecForMet.setBase("USD");
        expectedPrecForMet.setUnit("per ounce");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String newDate = format.format(date);
        expectedPrecForMet.setDate(newDate);
    }

    @Test
    void getGoldPriceInRub() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<PrecForMet> exchangeRateForMet =
                restTemplate.exchange("https://metals-api.com/api/latest?%20access_key=" +
                                "7pr699z7hga4ic7i61cpkidv3bjvgj7ikro09dnp726wnzu0nkh90d6kxqrh",
                        HttpMethod.GET, entity, PrecForMet.class, 1);
        Assertions.assertNotNull(exchangeRateForMet);
        PrecForMet actualPrecForMetall = exchangeRateForMet.getBody();

        Assertions.assertNotNull(actualPrecForMetall.getBase());
        Assertions.assertNotNull(actualPrecForMetall.getUnit());
        Assertions.assertNotNull(actualPrecForMetall.getDate());

        Assertions.assertEquals(expectedPrecForMet.getBase(), actualPrecForMetall.getBase());
        Assertions.assertEquals(expectedPrecForMet.getUnit(), actualPrecForMetall.getUnit());
        Assertions.assertEquals(expectedPrecForMet.getDate(), actualPrecForMetall.getDate());
    }
}