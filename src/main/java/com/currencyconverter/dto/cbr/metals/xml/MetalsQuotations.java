package com.currencyconverter.dto.cbr.metals.xml;

import lombok.Data;

@Data
public class MetalsQuotations {
    private Metall Metall;

    @Override
    public String toString()
    {
        return "ClassPojo [Metall = "+Metall+"]";
    }
}
