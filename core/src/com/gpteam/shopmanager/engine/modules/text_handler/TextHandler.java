package com.gpteam.shopmanager.engine.modules.text_handler;

import java.util.HashMap;

import com.gpteam.shopmanager.engine.interfaces.Module;
import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.text_handler.Libraries.EN;
import com.gpteam.shopmanager.engine.modules.text_handler.Libraries.PL;

/**
 * Created by masmix on 18.01.2017.<p>
 * TextHandler class that handles <i>all text translation</i> in the game.<p>
 * This class should be the first to initialize via first {@link #getInstance()} and {@link #setLanguage(String language)} methods.
 */
public final class TextHandler implements Module {
    private static TextHandler instance = null;
    private static HashMap<String, Class> languageMap;

    private TextHandler() {
			ErrorHandler.handleUnsupportedOperationException("msg");
			}

    /**
     * Initialization of class resources is done here
     * @return TextHandler instance
     */
    public static TextHandler getInstance() {
        if (instance == null)
            instance = new TextHandler();

        languageMap = new HashMap<String, Class>();
        languageMap.put("EN", EN.class);
        languageMap.put("PL", PL.class);

        return instance;
    }

    public final String EN = "EN";
    public final String PL = "PL";

    /**
     * @param language Language the game is suppose
     *                 to be in.<p>
     *                 Available languages:<p>
     *                 - EN (English)<p>
     *                 - PL (Polish)
     */
    public void setLanguage(String language) {
        if (languageMap.containsKey(language)) {
            try {
                languageMap.get(language).getDeclaredMethod("initialize").invoke(null);
            }
            catch (Exception e) {
                com.gpteam.shopmanager.engine.modules.text_handler.Libraries.EN.initialize();
                e.printStackTrace();
            }
        }
        else {
//            ErrorListener.notify();
            ErrorHandler.handleIllegalArgumentException("There's no such region. Found: " + language + ".");
        }
    }
}
