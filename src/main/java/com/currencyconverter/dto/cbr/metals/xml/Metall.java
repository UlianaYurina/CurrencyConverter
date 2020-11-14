package com.currencyconverter.dto.cbr.metals.xml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "metall")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "FromDate",
        "ToDate"
//        "Record"
})
public class Metall {

    private String name;

    private String FromDate;

    private String ToDate;

    @XmlElement(name="Record")
    private Record[] Record;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getFromDate ()
    {
        return FromDate;
    }

    public void setFromDate (String FromDate)
    {
        this.FromDate = FromDate;
    }

    public String getToDate ()
    {
        return ToDate;
    }

    public void setToDate (String ToDate)
    {
        this.ToDate = ToDate;
    }

    public Record[] getRecord ()
    {
        return Record;
    }

    public void setRecord (Record[] Record)
    {
        this.Record = Record;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", FromDate = "+FromDate+", ToDate = "+ToDate+", Record = "+Record+"]";
    }
}