package com.currencyconverter.dto.cbrPreciousMetalsXml;


public class MetalsQuotations {
    private Metall Metall;

    public Metall getMetall ()
    {
        return Metall;
    }

    public void setMetall (Metall Metall)
    {
        this.Metall = Metall;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Metall = "+Metall+"]";
    }
}