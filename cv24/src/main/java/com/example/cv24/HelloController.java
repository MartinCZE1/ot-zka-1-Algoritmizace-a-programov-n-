package com.example.cv24;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label sum;

    @FXML
    private TextField input1;
    @FXML
    private TextField input2;

    @FXML
    protected void onPlusClick() {
        Integer cislo1 = Integer.parseInt(input1.getText());
        Integer cislo2 = Integer.parseInt(input2.getText());
        sum.setText("Výsledek je: " + (cislo1 + cislo2));
    }

    @FXML
    protected void onMinusClick() {
        Integer cislo1 = Integer.parseInt(input1.getText());
        Integer cislo2 = Integer.parseInt(input2.getText());
        sum.setText("Výsledek je: " + (cislo1 - cislo2));
    }
}