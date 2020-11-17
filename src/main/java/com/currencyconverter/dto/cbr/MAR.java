
package com.currencyconverter.dto.cbr;

import com.currencyconverter.dto.CurrencyCode;
import lombok.Data;

import java.util.Date;

@Data
public class MAR {

    private CurrencyCode charCode;
    private Double buy_calc;
    private Double sell_calc;
    private Date date;

}
