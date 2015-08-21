package com.visaeurope.savethechildren.core;

/**
 * Created by dima on 21/08/2015.
 */
public class Location {

    String address;
    GPSCoordinates mapLocation;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GPSCoordinates getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(GPSCoordinates mapLocation) {
        this.mapLocation = mapLocation;
    }
}
