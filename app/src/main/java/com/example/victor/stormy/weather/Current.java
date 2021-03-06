package com.example.victor.stormy.weather;


import com.example.victor.stormy.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Current {
    public String mIcon;
    private long mTime;
    private double mTemperture;
    private double mHumidity;
    private double mPrecipe;
    private String mSummary;
    private String mTimeZone;
    private String mCity;


    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        return Forecast.getIconId(mIcon);
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mm a");
        dateFormat.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        String timeString = dateFormat.format(new Date(getTime() * 1000));

        return  timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperture() {
        return (int)Math.round(mTemperture);
    }

    public void setTemperture(double temperture) {
        mTemperture = temperture;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipe() {
        double precipPercent = mPrecipe * 100;
        return (int)Math.round(precipPercent);
    }

    public void setPrecipe(double precipe) {
        mPrecipe = precipe;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }
}
