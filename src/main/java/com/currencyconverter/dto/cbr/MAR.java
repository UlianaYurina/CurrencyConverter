
package com.currencyconverter.dto.cbr;

import com.currencyconverter.dto.CurrencyCode;

import java.util.Date;

public class MAR {

    private CurrencyCode charCode;
    private Double buy_calc;
    private Double sell_calc;
    private Date date;

    public CurrencyCode getCharCode() {
        return charCode;
    }

    public void setCharCode(CurrencyCode charCode) {
        this.charCode = charCode;
    }

    public Double getBuy_calc() {
        return buy_calc;
    }

    public void setBuy_calc(Double buy_calc) {
        this.buy_calc = buy_calc;
    }

    public Double getSell_calc() {
        return sell_calc;
    }

    public void setSell_calc(Double sell_calc) {
        this.sell_calc = sell_calc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
