package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void up(ActionEvent e){
        System.out.println("up");
    }
    public void right(ActionEvent e){
        System.out.println("right");
    }
    public void left(ActionEvent e){
        System.out.println("left");
    }
    public void down(ActionEvent e){
        System.out.println("down");
    }

}