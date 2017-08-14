package com.gpteam.shopmanager.engine;

import com.badlogic.gdx.Gdx;
import com.gpteam.shopmanager.economy.Economy;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.game_date.GameDate;
import com.gpteam.shopmanager.time.Time;

import java.util.HashMap;

/*
 * Created by masmix on 07.02.2017.
 */
public final class Engine {
    private HashMap<String,Class> modules;
    private Economy economy;
    private GameDate gameDate;
    private Time time;
    /**
     *
     */
    public static int citizens;
    /**
     *
     */
    public static int[] citizenSocietyClasses;

    public void initialize() {
        modules = new HashMap<String, Class>();
        modules.put("ErrorHandler", ErrorHandler.class);

        economy = new Economy();
        gameDate = new GameDate();
        time = new Time();
    }

    @SuppressWarnings("unchecked")
    public void invoke(String className, String methodName) {
        try { modules.get(className).getDeclaredMethod(methodName).invoke(null); }
        catch (Exception ex) { ErrorHandler.handleNoSuchMethodException("No such method. Found: " + methodName); }
    }

    public void update() {
        economy.update();
    }

    public HashMap<String, Class> getModules() {
        return modules;
    }

    public Economy getEconomy() {
        return economy;
    }

    public GameDate getGameDate() {
        return gameDate;
    }

    public Time getTime() {
        return time;
    }

    public static int getCitizens() {
        return citizens;
    }

    public static int[] getCitizenSocietyClasses() {
        return citizenSocietyClasses;
    }
}
