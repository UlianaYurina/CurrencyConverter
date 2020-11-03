package com.currencyconverter.controller;

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.earth.weather.WeatherDto;
import com.currencyconverter.dto.mars.SolTemperature;
import com.currencyconverter.service.ConverterService;
import com.currencyconverter.service.EarthWeatherServiceImpl;
import com.currencyconverter.service.MarsWeatherService;
import com.currencyconverter.service.PreciousMetalsQuotationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
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

    @PostMapping("/exchangeRate")
    public String getExchange(@RequestBody TransferDto transferDto) {
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

    @GetMapping("/goldPrice")
    public String getGoldPrice(@RequestParam(value = "date", defaultValue = "") String date) {
        return preciousMetalsQuotationsService.getMetalsPrice();
    }



}
