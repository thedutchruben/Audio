package nl.thedutchruben;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Client extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Audio Client");
        primaryStage.show();
        startMenu(primaryStage);
    }


    public void startMenu(Stage stage){


        Text text = new Text();
        text.setText("Audio Client");
        text.setFont(new Font(45.00));
        text.setX(stage.getX() /2);
        text.setY(stage.getY() /2);
        Group root = new Group(text);
        Scene scene = new Scene(root, 600, 300);

//        scene.setFill(Color.BLACK);
        stage.setScene(scene);
    }
}
