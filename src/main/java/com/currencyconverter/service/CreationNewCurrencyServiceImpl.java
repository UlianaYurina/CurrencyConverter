package com.currencyconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreationNewCurrencyServiceImpl implements  CreationNewCurrencyService {


    @Autowired
    private EarthWeatherServiceImpl earthWeatherService;

    @Autowired
    private PreciousMetalsQuotationsServiceImpl preciousMetalsQuotationsService;


    public Double getNewCurrency(String city) { //x RUB -- 1 MAR
        System.out.println(city);

        return (preciousMetalsQuotationsService.getGoldPriceInRub() /
                earthWeatherService.getCurrentWeather(city).getMain().getTemp());
    }

}
