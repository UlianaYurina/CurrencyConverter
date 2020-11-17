package com.currencyconverter.dto.cbr.metals.xml;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
//        "Sell",
//        "Buy",
        "Code",
        "Date"
})
@Data
public class Record {

        @XmlElement(name = "Sell")
        private String Sell;

        @XmlElement(name = "Buy")
        private String Buy;

        private String Code;

        private String Date;

        @Override
        public String toString()
        {
            return "ClassPojo [Sell = "+Sell+", Buy = "+Buy+", Code = "+Code+", Date = "+Date+"]";
        }
    }


