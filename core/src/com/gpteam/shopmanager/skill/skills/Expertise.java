package com.gpteam.shopmanager.skill.skills;

import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.game.engine.modules.text_handler.Text;
import com.gpteam.shopmanager.variables.Variables;

/*
 * Created by masmix on 20.01.2017.
 */
public class Expertise {
    private short skillLevel;
    private short currentSkillPoints; // TODO certain amount of skillpoints required to get to next skillLevel
    
    public Expertise() {
    		skillLevel = 0;
    }

    public Expertise(short skillLevel) {
        if (skillLevel < Variables.MIN_SKILL_LEVEL
                || skillLevel > Variables.MAX_SKILL_LEVEL)
            ErrorHandler.handleIllegalArgumentException("Incorrect skill level. Found: " + skillLevel);

        this.skillLevel = skillLevel;
    }

    public short getSkillLevel() {
        return skillLevel;
    }

    public void raiseSkill(short skillLevel) {
        if (this.skillLevel + skillLevel < Variables.MIN_SKILL_LEVEL
                || this.skillLevel + skillLevel > Variables.MAX_SKILL_LEVEL)
            ErrorHandler.handleIllegalArgumentException("Incorrect skill level. Found: " + skillLevel);

        this.skillLevel += skillLevel;
    }

    public void lowerSkill(short skillLevel) {
        if (this.skillLevel - skillLevel < Variables.MIN_SKILL_LEVEL
                || this.skillLevel - skillLevel > Variables.MAX_SKILL_LEVEL)
            ErrorHandler.handleIllegalArgumentException("Incorrect skill level. Found: " + skillLevel);

        this.skillLevel -= skillLevel;
    }

    public String getName() {
        return Text.expertise;
    }

    public String getDescription() {
        return Text.expertiseDescription;
    }
}