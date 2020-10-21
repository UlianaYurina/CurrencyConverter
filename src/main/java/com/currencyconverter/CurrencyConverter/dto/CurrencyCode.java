package com.currencyconverter.CurrencyConverter.dto;

public enum CurrencyCode {

    EUR("Euro Member Countries"),
    MAR("Martian Ruble"),
    RUB("Russia Ruble"),
    USD("United States Dollar");

    private final String description;

    CurrencyCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
