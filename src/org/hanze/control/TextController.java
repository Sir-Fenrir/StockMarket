package org.hanze.control;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sander on 9/16/2015.
 */
public class TextController implements Observer, StockView {

    private static String VIEW_NAME = "Text";

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }
}
