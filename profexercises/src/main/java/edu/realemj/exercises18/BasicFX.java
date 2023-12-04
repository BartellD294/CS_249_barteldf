package edu.realemj.exercises18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasicFX extends Application {
    public void start(Stage primaryStage) {

        Button btOK = new Button("OK");
        btOK.setOnAction(new OKButtonListener());

        Button [] numButtons = new Button[5];
        for(int i = 0; i < numButtons.length; i++) {
            numButtons[i] = new Button("" + i);
        }

        /*
        VBox pane = new VBox();
        for(int i = 0; i < numButtons.length; i++) {
            pane.getChildren().add(numButtons[i]);
        }*/

        GridPane pane = new GridPane();
        pane.add(numButtons[0], 0,0);
        pane.add(numButtons[1], 2,0);
        pane.add(numButtons[2], 0,2);
        pane.add(numButtons[3], 2,2);
        pane.add(numButtons[4], 1,1);

        BorderPane masterPane = new BorderPane();
        masterPane.setCenter(btOK);
        masterPane.setBottom(pane);

        Scene scene = new Scene(masterPane, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("BEHOLD!");
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
