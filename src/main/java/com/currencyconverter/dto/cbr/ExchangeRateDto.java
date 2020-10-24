package com.currencyconverter.dto.cbr;

public class ExchangeRateDto
{
    private ValCurs ValCurs;
    public ValCurs getValCurs ()
    {
        return ValCurs;
    }
    public void setValCurs (ValCurs ValCurs)
    {
        this.ValCurs = ValCurs;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ValCurs = "+ValCurs+"]";
    }
}

