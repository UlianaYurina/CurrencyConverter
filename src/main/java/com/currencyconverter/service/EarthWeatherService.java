package com.currencyconverter.service;

import com.currencyconverter.dto.earth.weather.WeatherDto;

public interface EarthWeatherService {
    WeatherDto getCurrentWeather(String city);
}
