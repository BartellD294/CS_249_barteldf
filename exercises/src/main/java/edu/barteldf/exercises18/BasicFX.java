package edu.barteldf.exercises18;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasicFX extends Application
{
    public void start(Stage primaryStage)
    {
        Button btOK = new Button("OK");
        //btOK.setOnAction(new OKButtonListener());

        Button[] numButtons = new Button[5];
        for (int i = 0; i < numButtons.length; i++)
        {
            numButtons[i] = new Button(""+i);
        }
        GridPane pane = new GridPane();
        for (int i = 0; i < numButtons.length; i++)
        {
            pane.add(numButtons[i],i,i);
        }
        BorderPane masterPane = new BorderPane();
        masterPane.setCenter(btOK);
        masterPane.setBottom(pane);
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First JavaFX Window");
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
