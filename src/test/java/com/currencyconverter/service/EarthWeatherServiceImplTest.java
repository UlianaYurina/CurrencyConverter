package com.currencyconverter.service;

import com.currencyconverter.dto.earth.weather.WeatherDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EarthWeatherServiceImplTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String city = "Moskow";

    @Test
    void getCurrentWeather() {

        UriComponentsBuilder accuWeather =
                UriComponentsBuilder
                        .fromUriString("https://community-open-weather-map.p.rapidapi.com/weather")
                        .queryParam("lat", 0)
                        .queryParam("lon", 0)
                        .queryParam("id", 2172797)
                        .queryParam("lang", "null")
                        .queryParam("units", "metric")
                        .queryParam("mode", "json")
                        .queryParam("q", city);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("x-rapidapi-host","community-open-weather-map.p.rapidapi.com");
        httpHeaders.add("x-rapidapi-key","24127881c1mshdc03b4c52a44067p1c7fd4jsne0d7bd6ff975");

//        HttpEntity entity = new HttpEntity(httpHeaders);
        WeatherDto weatherDto = new WeatherDto();

//        ResponseEntity<WeatherDto> response = restTemplate.postForEntity();

    }
}