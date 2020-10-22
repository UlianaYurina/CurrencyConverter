package com.currencyconverter.CurrencyConverter.service;

//http://www.cbr.ru/scripts/XML_daily.asp?
import com.currencyconverter.CurrencyConverter.dto.TransferDto;
import lombok.SneakyThrows;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//конвертация по курсу из валюты отправителяв валюту получателя
public class ConverterServiceImpl implements ConverterService {
    @SneakyThrows
    public String getCourses() {

        //достать курс валют по url


        return null; //вернуть json, причем оставить только рудли, и доллары
    }

    public String makeTransfer(TransferDto transferDto) {





        return null;
    }
}
