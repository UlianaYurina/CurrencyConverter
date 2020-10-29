package com.currencyconverter.service;

import com.currencyconverter.dto.earth.weather.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class EarthWeatherService {

    @Autowired
    private RestTemplate restTemplate;

    public WeatherDto getCurrentWeather (String city) {
        UriComponentsBuilder accuWeather =
                UriComponentsBuilder
                        .fromUriString("https://community-open-weather-map.p.rapidapi.com/weather")
                        .queryParam("lat",0)
                .queryParam("lon", 0)
                .queryParam("id",2172797)
                .queryParam("lang", "null")
                .queryParam("units", "metric")
                .queryParam("mode", "json")
                .queryParam("q", city);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("x-rapidapi-host","community-open-weather-map.p.rapidapi.com");
        httpHeaders.add("x-rapidapi-key", "24127881c1mshdc03b4c52a44067p1c7fd4jsne0d7bd6ff975");
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<WeatherDto> weatherDtoResponseEntity =
                restTemplate.exchange(accuWeather.toUriString(), HttpMethod.GET, entity, WeatherDto.class, 1);
        System.out.println(weatherDtoResponseEntity.getBody());
        WeatherDto body = weatherDtoResponseEntity.getBody();

        return weatherDtoResponseEntity.getBody();

    }
}
