package com.currencyconverter.controller;

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.earth.weather.WeatherDto;
import com.currencyconverter.dto.mars.SolTemperature;
import com.currencyconverter.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


//http://www.cbr.ru/scripts/xml_metall.asp?date_req1=20/10/2020&date_req2=01/11/2020
@RestController
public class AppController {

    @Autowired
    private ConverterService converterService;

    @Autowired
    private MarsWeatherService marsWeatherService;

    @Autowired
    private EarthWeatherServiceImpl earthWeatherService;

    @Autowired
    private  PreciousMetalsQuotationsService preciousMetalsQuotationsService;

    @Autowired
    private CreationNewCurrencyService creationNewCurrencyService;

    @PostMapping(value = "/exchangeRate")
    public Double getExchange(@RequestBody TransferDto transferDto) {
        return converterService.getExchangeRate(transferDto);
    }

    @GetMapping("/mars/temperature")
    public SolTemperature getMarsTemperature(@RequestParam(value = "sol", defaultValue = "") String sol) throws JSONException {
        return new SolTemperature(marsWeatherService.getSolTemperature(sol));
    }

    @GetMapping("/earth/weather")
    public WeatherDto getEarthTemperature(@RequestParam(value = "city", defaultValue = "") String city) {
        return earthWeatherService.getCurrentWeather(city);
    }

    @PostMapping("/goldPrice")
    public Double getGoldPrice() {
        return preciousMetalsQuotationsService.getMetalsPrice();
    }

    @GetMapping("/newCurrency")
    public Double getNewCurrency(@RequestParam(value = "city", defaultValue = "") String city) {
        return creationNewCurrencyService.getNewCurrency(city);
    }





}
