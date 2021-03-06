package com.gpteam.shopmanager.variables;

import com.gpteam.shopmanager.character.CharacterInfo;
import com.gpteam.shopmanager.deprecated.NamesLoader;
import com.gpteam.shopmanager.economy.Economy;
import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.npc.NPCHandler;
import com.gpteam.shopmanager.needs.Needs;
import com.gpteam.shopmanager.product.Product;
import com.gpteam.shopmanager.skill.SkillLogic;
import com.gpteam.shopmanager.deprecated.traffic.TrafficHandler;
import com.gpteam.shopmanager.time.Time;

import java.math.BigDecimal;

/*
 * Created by masmix on 04.02.2017.
 */
public final class Variables {
    private Variables() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }
    /**
     * {@link NamesLoader}
     * <p>NAMES_PATH - location of file with random names
     */
    public final static String NAMES_PATH = "names.txt";

    /** {@link CharacterInfo} */
    public final static int MAX_NAME_LENGTH = 25;
    public final static int MIN_NAME_LENGTH = 2;
    public final static int MAX_AGE_LENGTH = 120;
    public final static int MIN_AGE_LENGTH = 16;

    /** {@link SkillLogic} */
    public final static int MAX_SKILL_LEVEL = 120;
    public final static int MIN_SKILL_LEVEL = 0;

    /** {@link NPCHandler} */
    public final static int MAX_NPC_AMOUNT = 10000;
    public final static int MIN_NPC_AMOUNT = 0;

    /** {@link TrafficHandler} */
    public final static int MAX_TRAFFIC_LOAD = 100;
    public final static int MIN_TRAFFIC_LOAD = 0;

    /** {@link Time}
     * <p>time between time incrementation in milliseconds (1 second = 1000 milliseconds) */
    public final static int DELAY = 500;
    /** amount of seconds in a minute */
    public final static int SECONDS = 10;

    /** {@link Needs} */
    public final static int MIN_NEED_VALUE = 0;
    public final static int MAX_NEED_VALUE = 100;

    /** {@link Product} */
    public static final int MAX_QUANTITY = 1000000;
    public static final int MIN_QUANTITY = 0;
    public static final int MAX_QUALITY = 100;
    public static final int MIN_QUALITY = 0;

    /** {@link Economy} */
    public static final float MIN_DAILY_VARIATION = -0.4f;
    public static final float MAX_DAILY_VARIATION = 0.4f;
    public static final float MAX_ECONOMY_BAR_VALUE = 5.0f;
    public static final float MIN_ECONOMY_BAR_VALUE = 0.0f;


    /** ShopManager default scale for classes that deal with money.
     *  Use, when calling {@link BigDecimal#setScale(int, int)}*/
    public static final int MONEY_SCALE = 2;
    /** Rounding mode for classes involved with BigDecimal objects*/
    public static final int ROUNDING_MODE = BigDecimal.ROUND_HALF_UP;
}
