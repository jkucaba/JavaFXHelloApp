package com.jakubku.firstapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20); // wszytskie el jakie dodamy mają 20 przerwy
        Label text = new Label("");
        Button button = new Button("Click Me!");
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application"));
        root.getChildren().addAll(text, button);
        Scene scene = new Scene(root, 350, 300); //tworzymy scenę (okienko)
        stage.setScene(scene); //dodajemy scenę na scenę
        stage.setTitle("JavaFX Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}