package com.currencyconverter.service;

import com.currencyconverter.dto.CurrencyCode;
import com.currencyconverter.dto.mars.valute.MAR;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

@SpringBootTest
@AutoConfigureMockMvc
class CreationNewCurrencyServiceImplTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EarthWeatherServiceImpl earthWeatherService;

    @MockBean
    private PreciousMetalsQuotationsServiceImpl preciousMetalsQuotationsService;

    private static final String city = "Moscow";


    @Test
    void getNewCurrency() throws Exception {


    }
}