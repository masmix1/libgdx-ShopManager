package com.gpteam.shopmanager.district;

/*
 * Created by masmix on 28.01.2017.
 */
public class District {
    private String areaName;
    private int population;

    private static int MIN_POPULATION_AMOUNT = 0;
    private static int MAX_POPULATION_AMOUNT = 5000;

    public District(String areaName) {
        this.areaName = areaName;
    }
}
