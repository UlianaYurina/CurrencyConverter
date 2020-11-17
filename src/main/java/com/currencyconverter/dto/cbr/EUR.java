
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
    "ID",
    "NumCode",
    "CharCode",
    "Nominal",
    "Name",
    "Value",
    "Previous"
})
@Data
public class EUR {

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

}
