
package com.currencyconverter.dao;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "mar_currency")
public class MarEntity {

    private String charCode;
    private String description;
    private Double buy_calc;
    private Double sell_calc;
    private Date date;


}
