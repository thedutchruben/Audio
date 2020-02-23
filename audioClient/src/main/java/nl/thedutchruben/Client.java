package nl.thedutchruben;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputMethodHighlight;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.geom.Rectangle2D;

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

        try {
            StackPane root = new StackPane();
            Text text = new Text("Audio Client" );
            text.setFont(new Font(45.00));

            text.setFill(Color.BLACK);
            text.setTextAlignment(TextAlignment.CENTER);
            root.getChildren().addAll(text);
            javafx.scene.control.TextField textField = new javafx.scene.control.TextField("Hostname : ");
            textField.setCursor(Cursor.TEXT);

            root.getChildren().add(textField);
            StackPane.setAlignment(text, Pos.TOP_CENTER);


            Scene scene = new Scene(root, 600, 300,Color.GRAY);
            stage.setScene(scene);

            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
