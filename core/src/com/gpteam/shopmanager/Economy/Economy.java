package com.gpteam.shopmanager.Economy;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.math.BigDecimal;

/*
 * Created by masmix on 02.02.2017.
 */
public class Economy {
    private BigDecimal totalMoney; //needed?
    private float economyBar;
    private static final float MAX_ECONOMY_BAR_VALUE = 5.0f;
    
    public float getEconomyBar() {
        return economyBar;
    }
    
    public void raiseEconomyBar(float amount) {
        if (amount > 0 && amount + MAX_ECONOMY_BAR_VALUE <= MAX_ECONOMY_BAR_VALUE)
            economyBar += amount;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void lowerEconomyBar(float amount) {
        if (amount <= economyBar)
    		economyBar -= amount;
        else
    		ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void setEconomyBar(float economyBar) {
    		if (economyBar > 0 && economyBar <= MAX_ECONOMY_BAR_VALUE)
    				this.economyBar = economyBar;
    		else
    				ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void update() {
    }
    
    public BigDecimal getTotalMoney() {
    		return totalMoney;
    }

    public void addTotalMoney(BigDecimal money) {
        totalMoney = totalMoney.add(money);
    }
}
