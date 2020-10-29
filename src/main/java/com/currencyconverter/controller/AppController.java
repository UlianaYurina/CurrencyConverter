package com.currencyconverter.controller;

import com.currencyconverter.dto.TransferDto;
import com.currencyconverter.dto.TransferResult;
import com.currencyconverter.dto.earth.weather.WeatherDto;
import com.currencyconverter.dto.mars.SolTemperature;
import com.currencyconverter.service.ConverterService;
import com.currencyconverter.service.EarthWeatherService;
import com.currencyconverter.service.MarsWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @Autowired
    private ConverterService converterService;

    @Autowired
    private MarsWeatherService marsWeatherService;

    @Autowired
    private EarthWeatherService earthWeatherService;

    @PostMapping("/exchange")
    public String getExchange (@RequestBody TransferDto transferDto) {
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
}
