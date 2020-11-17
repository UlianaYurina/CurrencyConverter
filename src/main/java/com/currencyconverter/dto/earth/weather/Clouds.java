
package com.currencyconverter.dto.earth.weather;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "all"
})
@Data
public class Clouds {

    @JsonProperty("all")
    private Integer all;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

}
