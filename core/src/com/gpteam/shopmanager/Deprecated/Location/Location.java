package com.gpteam.shopmanager.Deprecated.Location;

import com.gpteam.shopmanager.Society.ESocietyClass;
import com.gpteam.shopmanager.Deprecated.Traffic.TrafficHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 24.12.2016.
 */
public class Location {
    private ArrayList<ESocietyClass> ESocietyClasses;
    private TrafficHandler trafficHandler;

    private void initialize() {
        trafficHandler = new TrafficHandler();
    }
}
