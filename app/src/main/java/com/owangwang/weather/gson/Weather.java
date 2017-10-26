package com.owangwang.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wangchao on 2017/10/26.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Sugguestion sugguestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
