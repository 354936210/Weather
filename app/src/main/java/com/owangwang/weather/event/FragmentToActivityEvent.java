package com.owangwang.weather.event;

/**
 * Created by wangchao on 2017/10/27.
 */

public class FragmentToActivityEvent {
    private String message;
    public FragmentToActivityEvent(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
