package com.currencyconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsWeatherService {
    @Autowired
    private RestTemplate restTemplate;

    public double getSolTemperature(String solName) throws JSONException {

        JSONObject data = this.getInsight();
        JSONArray solKeys = data.getJSONArray("sol_keys");
        System.out.println(solKeys);

        // Has a sol with this name
        if (this.hasSol(solName, solKeys))
            return this.getTemperatureFromSolObject(data.getJSONObject(solName));

        // There is no sol with this name, so let's get the average.
        return this.getAverageTemperatureFromAll(data, solKeys);
    }

    protected JSONObject getInsight() throws JSONException {
        return new JSONObject(restTemplate.getForObject("https://api.nasa.gov/insight_weather/?api_key=qut9GuOWDGcxAEOw9z39kq6BgkuWo9i0eX7H8KFr&feedtype=json&ver=1.0", String.class));
    }

    protected boolean hasSol(String solName, JSONArray solKeys) throws JSONException {
        for (int i = 0; i < solKeys.length(); i++) {
            if (solKeys.getString(i).equals(solName))
                return true;
        }
        return false;
    }

    protected double getTemperatureFromSolObject(JSONObject solObject) throws JSONException {
        return solObject.getJSONObject("AT").getDouble("av");
    }

    protected float getAverageTemperatureFromAll(JSONObject data, JSONArray solKeys) throws JSONException {
        float average = 0.0f;

        for (int i = 0; i < solKeys.length(); i++) {
            average += this.getTemperatureFromSolObject(data.getJSONObject(solKeys.getString(i)));
        }

        return average / solKeys.length();
    }

}
