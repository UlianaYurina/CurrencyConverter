package com.currencyconverter.dto.cbr.metals.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "metall")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "FromDate",
        "ToDate"
})
@Data
public class Metall {

    private String name;

    private String FromDate;

    private String ToDate;

    @XmlElement(name="Record")
    private Record[] Record;

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", FromDate = "+FromDate+", ToDate = "+ToDate+", Record = "+Record+"]";
    }
}
