
package com.currencyconverter.dto.mars.valute;

import com.currencyconverter.dto.CurrencyCode;
import lombok.Data;

import java.util.Date;

@Data
public class MAR {

    private CurrencyCode charCode;
    private Double buyCalc;
    private Double sellCalc;
    private Date date;
}
