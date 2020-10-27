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

public class Valute
{
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







//{
//    private String CharCode;
//
//    private String Value;
//
//    private String ID;
//
//    private String Nominal;
//
//    private String NumCode;
//
//    private String Name;
//
//    public String getCharCode ()
//    {
//        return CharCode;
//    }
//
//    public void setCharCode (String CharCode)
//    {
//        this.CharCode = CharCode;
//    }
//
//    public String getValue ()
//    {
//        return Value;
//    }
//
//    public void setValue (String Value)
//    {
//        this.Value = Value;
//    }
//
//    public String getID ()
//    {
//        return ID;
//    }
//
//    public void setID (String ID)
//    {
//        this.ID = ID;
//    }
//
//    public String getNominal ()
//    {
//        return Nominal;
//    }
//
//    public void setNominal (String Nominal)
//    {
//        this.Nominal = Nominal;
//    }
//
//    public String getNumCode ()
//    {
//        return NumCode;
//    }
//
//    public void setNumCode (String NumCode)
//    {
//        this.NumCode = NumCode;
//    }
//
//    public String getName ()
//    {
//        return Name;
//    }
//
//    public void setName (String Name)
//    {
//        this.Name = Name;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "ClassPojo [CharCode = "+CharCode+", Value = "+Value+", ID = "+ID+", Nominal = "+Nominal+", NumCode = "+NumCode+", Name = "+Name+"]";
//    }



