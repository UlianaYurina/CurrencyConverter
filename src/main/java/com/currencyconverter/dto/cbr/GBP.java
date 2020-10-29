
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
    "ID",
    "NumCode",
    "CharCode",
    "Nominal",
    "Name",
    "Value",
    "Previous"
})
public class GBP {

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("NumCode")
    public String getNumCode() {
        return numCode;
    }

    @JsonProperty("NumCode")
    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    @JsonProperty("CharCode")
    public String getCharCode() {
        return charCode;
    }

    @JsonProperty("CharCode")
    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @JsonProperty("Nominal")
    public Integer getNominal() {
        return nominal;
    }

    @JsonProperty("Nominal")
    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Previous")
    public Double getPrevious() {
        return previous;
    }

    @JsonProperty("Previous")
    public void setPrevious(Double previous) {
        this.previous = previous;
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
