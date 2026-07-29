package org.example.group30_lifeinsuranceagency_2430810_2432057_2432097_2331068;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                Objects.requireNonNull(
                        getClass().getResource("/Jamiul_Huda/InsuranceAgent/InsuranceAgentDashboardView.fxml")
                )
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("Insurance Agent Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}