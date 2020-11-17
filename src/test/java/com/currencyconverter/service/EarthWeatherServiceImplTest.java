package com.currencyconverter.service;

import com.currencyconverter.dto.earth.weather.WeatherDto;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;
import static org.assertj.core.api.Assertions.assertThat;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.apache.tomcat.util.http.fileupload.FileUploadBase.CONTENT_TYPE;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EarthWeatherServiceImplTest {

    @Autowired
    private WeatherDto subject;

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().httpsPort(8089));

    private static final String city = "Moskow";

    @Test
    public void getCurrentWeather() throws Exception {

        wireMockRule.stubFor(get(urlPathEqualTo("/some-test-api-key"))
                .willReturn(aResponse()
                        .withBody("{\"var\":\"$(value)\"}")
                        .withHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .withStatus(200)));

    }
}