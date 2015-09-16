package org.hanze.control;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import org.hanze.model.Stock;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sander on 9/16/2015.
 */
public class TextController implements Observer, StockView {

    private static String VIEW_NAME = "Text";

    private HashMap<String, Label> labels;

    @FXML
    private Pane textPane;

    public TextController() {
        labels = new HashMap<>();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg.getClass() == Stock.class) {
            System.out.println("Update !");
            Stock stock = (Stock) arg;
            String name = stock.getName();
            if (labels.get(name) == null) {
                labels.put(name, new Label());
                labels.get(name).setText(name + " : " + stock.getPrice());
                //textPane.getChildren().add(labels.get(name));
            }else {
                labels.get(name).setText(name + " : " + stock.getPrice());
            }

            for(Map.Entry<String, Label> entry : labels.entrySet()){
                System.out.println("the valeu of"+ entry.getKey() + " is: " + entry.getValue());
            }
        }
    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }
}
