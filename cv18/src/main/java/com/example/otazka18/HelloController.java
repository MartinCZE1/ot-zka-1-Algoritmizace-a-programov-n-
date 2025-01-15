package com.example.otazka18;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField inputText;

    @FXML
    protected void onHelloButtonClick() {
        String num = inputText.getText();
        int numero = Integer.parseInt(num);

        welcomeText.setText(Integer.toBinaryString(numero));

    }
}