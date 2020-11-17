
package com.currencyconverter.dto.cbr;

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
    "Date",
    "PreviousDate",
    "PreviousURL",
    "Timestamp",
    "Valute"
})
@Data
public class ExchangeRateDto {

    @JsonProperty("Date")
    private String date;
    @JsonProperty("PreviousDate")
    private String previousDate;
    @JsonProperty("PreviousURL")
    private String previousURL;
    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("Valute")
    private Valute valute;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
