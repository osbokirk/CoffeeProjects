package org.example.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws Exception {
        //Stage stage = new Stage();
        Group root = new Group();

        Scene scence = new Scene(root, 600,600,Color.RED);
        stage.setTitle("Stage Demo Stage");
        Image icon = new Image("C:\\Users\\conno\\Desktop\\Projects\\CoffeeProjects\\Gui\\src\\small-intestine.png");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);

        Text text = new Text();
        text.setText("whoa were smoving");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("verdana",50));
        text.setFill(Color.GREENYELLOW);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(400);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.GREEN);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);



        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        //stage.setX(50);
        //stage.setY(50);
        stage.setFullScreen(false);
        stage.setFullScreenExitHint("YOU CANT LEAVE THE VOID Q to run" );
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.getIcons().add(icon);
        stage.setScene(scence);
        stage.show();

        //controlls
        TextField textField = new TextField("enter your fun");
        //password feild can be used to hide things from the user





    }
}