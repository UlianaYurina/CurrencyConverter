package com.currencyconverter.service;

import com.currencyconverter.dto.earth.weather.Coord;
import com.currencyconverter.dto.earth.weather.WeatherDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EarthWeatherServiceImplTest {

    @Autowired
    private RestTemplate restTemplate;

    private static final String city = "Moscow";
    private static final WeatherDto expectedWeatherDto = new WeatherDto();

    @BeforeAll
    static void setExpectedWeather () {
        expectedWeatherDto.setId(524901);
        Coord coord = new Coord();
        coord.setLat(55.75);
        expectedWeatherDto.setCoord(coord);
    }


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
        HttpEntity entity = new HttpEntity(httpHeaders);

        ResponseEntity<WeatherDto> weatherDtoResponseEntity =
                restTemplate.exchange(accuWeather.toUriString(), HttpMethod.GET, entity, WeatherDto.class, 1);
        Assertions.assertNotNull(weatherDtoResponseEntity);

        WeatherDto actualWeather = weatherDtoResponseEntity.getBody();

        Assertions.assertNotNull(actualWeather.getId());
        Assertions.assertNotNull(actualWeather.getCoord().getLat());

        Assertions.assertEquals(expectedWeatherDto.getId(), actualWeather.getId());
        Assertions.assertEquals(expectedWeatherDto.getCoord().getLat(), actualWeather.getCoord().getLat());

    }
}