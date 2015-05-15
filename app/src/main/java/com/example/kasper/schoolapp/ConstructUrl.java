package com.example.kasper.schoolapp;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by kasper on 5/15/2015.
 */
public class ConstructUrl {

    public String getDirectionsUrl(LatLng start, LatLng destination) {

        String KEY = "AIzaSyDgs8UO2DisJ_HC_U6skyOAimbS-dJbXGo";
        String url = "https://maps.googleapis.com/maps/api/directions/json?origin=" +
                "(" + start.latitude + "," + start.longitude + ")" + "&destination=" +
                "(" + destination.latitude + "," + destination.longitude + ")&key=" + KEY;

        return url;
    }
}
