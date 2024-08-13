package com.example.shippingmanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    // The welcomeText field is injected with the Label component defined in the FXML file
    @FXML
    private Label welcomeText;

    // This method is called when the "Hello" button is clicked
    @FXML
    protected void onHelloButtonClick() {
        // Update the welcomeText label with a greeting message
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onExitButtonClick() {
        System.exit(0);
    }

}