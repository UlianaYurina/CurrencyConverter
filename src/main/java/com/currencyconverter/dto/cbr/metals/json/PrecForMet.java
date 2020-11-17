
package com.currencyconverter.dto.cbr.metals.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success",
    "timestamp",
    "date",
    "base",
    "rates",
    "unit"
})
@Data
public class PrecForMet {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("date")
    private String date;
    @JsonProperty("base")
    private String base;
    @JsonProperty("rates")
    private Rates rates;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
