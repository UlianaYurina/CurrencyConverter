package com.currencyconverter.dto.cbr;

public class Valute
{
    private String CharCode;

    private String Value;

    private String ID;

    private String Nominal;

    private String NumCode;

    private String Name;

    public String getCharCode ()
    {
        return CharCode;
    }

    public void setCharCode (String CharCode)
    {
        this.CharCode = CharCode;
    }

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getID ()
    {
        return ID;
    }

    public void setID (String ID)
    {
        this.ID = ID;
    }

    public String getNominal ()
    {
        return Nominal;
    }

    public void setNominal (String Nominal)
    {
        this.Nominal = Nominal;
    }

    public String getNumCode ()
    {
        return NumCode;
    }

    public void setNumCode (String NumCode)
    {
        this.NumCode = NumCode;
    }

    public String getName ()
    {
        return Name;
    }

    public void setName (String Name)
    {
        this.Name = Name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CharCode = "+CharCode+", Value = "+Value+", ID = "+ID+", Nominal = "+Nominal+", NumCode = "+NumCode+", Name = "+Name+"]";
    }
}


