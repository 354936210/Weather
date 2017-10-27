package com.owangwang.weather.gson;

/**
 * Created by wangchao on 2017/10/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
