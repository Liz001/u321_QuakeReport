package com.example.android.quakereport;

import android.content.Intent;
import android.net.Uri;

/**
 * Created by Liz on 23/05/2017.
 */

public class Earthquake {
    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;
    /**
     * Location of earthquake
     **/
    private String mLocation;
    /**
     * Date of earthquake
     **/
    private String mDate;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;
    /**
     * Website URL of the earthquake
     */
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Returns the magnitude of the earthquake
     **/

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
