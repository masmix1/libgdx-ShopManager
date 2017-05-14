package com.gpteam.shopmanager.Time;

import com.gpteam.shopmanager.Variables.Variables;

public final class Time implements Runnable {
    private static Date date;

    @Override
    public void run() {
        date = new Date();
        for (int i = 1; i <= 24; i++) {
            for (int j = 1; j <= 60; j++) {
                for (int k = 1; k <= Variables.SECONDS; k++) {
                    if (i == 24 && j == 60 && k == Variables.SECONDS) {
                        date.plusDays(1);
                        i = 1;
                        j = 1;
                        k = 1;
                    }
                    date.plusSeconds(1);
                    try { Thread.sleep(Variables.DELAY); }
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
                date.plusMinutes(1);
            }
            date.plusHours(1);
        }
    }

    public static void initialize() {
    } // TODO Add start date
}