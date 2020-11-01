package com.currencyconverter.service;

import com.fasterxml.jackson.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PreciousMetalsQuotationsServiceImpl implements PreciousMetalsQuotationsService {

    XmlMapper xmlMapper = new XmlMapper();

    public String getMetalsPrice(Date date) {


        return null;
    }
}
