
package com.currencyconverter.dto.cbr;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Date",
    "PreviousDate",
    "PreviousURL",
    "Timestamp",
    "Valute"
})
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

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("PreviousDate")
    public String getPreviousDate() {
        return previousDate;
    }

    @JsonProperty("PreviousDate")
    public void setPreviousDate(String previousDate) {
        this.previousDate = previousDate;
    }

    @JsonProperty("PreviousURL")
    public String getPreviousURL() {
        return previousURL;
    }

    @JsonProperty("PreviousURL")
    public void setPreviousURL(String previousURL) {
        this.previousURL = previousURL;
    }

    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Valute")
    public Valute getValute() {
        return valute;
    }

    @JsonProperty("Valute")
    public void setValute(Valute valute) {
        this.valute = valute;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
