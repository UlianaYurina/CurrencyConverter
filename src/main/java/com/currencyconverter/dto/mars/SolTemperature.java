package com.currencyconverter.dto.mars;


public class SolTemperature {

        private final double averageTemperature;

        public SolTemperature(double avT) {
            this.averageTemperature = avT;
        }

        public double getAverageTemperature() {
            return this.averageTemperature;
        }
}
