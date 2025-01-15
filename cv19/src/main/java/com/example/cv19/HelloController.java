package com.example.cv19;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

    @FXML
    protected void onPressed() {
        String text = textField.getText();
        welcomeText.setText(text);
        textField.setText("");
    }
}