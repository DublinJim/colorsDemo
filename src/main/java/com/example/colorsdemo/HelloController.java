package com.example.colorsdemo;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class HelloController {

    String color1 = "#F00F";
    String color2 = "#FF0000";
    String color3 = "#F00";
    String color4 = "#ff0000ff";

    @FXML
    private AnchorPane anchorPane;

    @FXML
    protected void onHelloButtonClick() {

        BackgroundFill backgroundFill = new BackgroundFill(Color.valueOf(color3), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        anchorPane.setBackground(background);
    }


}