package com.gpteam.shopmanager.product;

import com.gpteam.shopmanager.engine.modules.error_handler.ErrorHandler;
import com.gpteam.shopmanager.engine.modules.text_handler.Text;

/**
 * Created by masmix on 14.05.2017.<p>
 *
 * ProductView class that contains the information on all products in the game.
 * That information is stored in individual arrays named as the product name.
 * Each index contains different info on the product from {@link Text} class.<p>
 * Use this class to create {@link Product} class objects more easily.<p>
 * It goes as follows:<p>
 *                                                         example:<p>
 * index 0: product name                                   productName<p>
 * index 1: product serial name                            PRODUCT_SERIALNAME<p>
 * index 2: product description                            productDescription<p>
 * --------------------------------------------------------------------------<p>
 * Class must be initialized after TextHandler class!
 */
public final class ProductView {
    public static String[] apple;

    private ProductView() { ErrorHandler.handleUnsupportedOperationException("msg"); }

    public static void initialize() {
        apple = new String[]{Text.appleName, Text.APPLE_SERIALNAME, Text.appleDescription};
    }

}