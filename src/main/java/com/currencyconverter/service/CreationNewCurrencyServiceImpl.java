package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import com.currencyconverter.dto.mars.valute.MAR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CreationNewCurrencyServiceImpl implements  CreationNewCurrencyService {

    @Autowired
    private EarthWeatherServiceImpl earthWeatherService;

    @Autowired
    private PreciousMetalsQuotationsServiceImpl preciousMetalsQuotationsService;

    public Double getNewCurrency(String city) { // 1 MAR -- x RUB
        MAR mar = new MAR();
        mar.setCharCode(CurrencyCode.MAR);
        mar.setSellCalc(preciousMetalsQuotationsService.getGoldPriceInRub() /
                (5.5 * earthWeatherService.getCurrentWeather(city).getMain().getTemp()));
        mar.setBuyCalc(mar.getSellCalc()*0.9);
        mar.setDate(new Date());

        return mar.getBuyCalc();
    }

}
