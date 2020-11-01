package com.currencyconverter.dto;

public enum CurrencyCode {

    EUR("Euro Member Countries"),
    MAR("Martian Ruble"),
    GBR("United Kingdom Pound"),
    USD("United States Dollar");

    private final String description;

    CurrencyCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
