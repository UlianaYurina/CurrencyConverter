package com.currencyconverter.dto.cbr;

public class ValCurs
{
    private String name;

    private String Date;

    private Valute[] Valute;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    public Valute[] getValute ()
    {
        return Valute;
    }

    public void setValute (Valute[] Valute)
    {
        this.Valute = Valute;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", Date = "+Date+", Valute = "+Valute+"]";
    }
}