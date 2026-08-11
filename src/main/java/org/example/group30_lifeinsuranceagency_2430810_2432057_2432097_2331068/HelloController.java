package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application! Edited");
    }
}
