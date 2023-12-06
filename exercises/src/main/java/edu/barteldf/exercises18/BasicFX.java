package edu.barteldf.exercises18;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasicFX extends Application
{
    private int clickCount = 0;

    public int getClickCount() {return this.clickCount;}
    public void setClickCount(int cc) {this.clickCount = cc;}

    private class InnerOKButtonListener implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            Node n = (Node)event.getSource();
            if (n instanceof Button b)
            {
                b.setText(b.getText() + "!");
                System.out.println("Button pressed!");
                clickCount++;
            }
        }
    }
    public void start(Stage primaryStage)
    {
        Button btOK = new Button("OK");
        Label clickLabel = new Label("Click count: " + this.clickCount);
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event)
            {
                Node n = (Node) event.getSource();
                if (n instanceof Button b)
                {
                    b.setText(b.getText() + "!");
                    System.out.println("Button pressed!");
                    clickCount++;
                    clickLabel.setText("Click count: " + clickCount);
                }
            }

        };

        btOK.setOnAction(e->{
            Node n = (Node) e.getSource();
            if (n instanceof Button b)
            {
                b.setText(b.getText() + "!");
                System.out.println("Button pressed!");
                clickCount++;
                clickLabel.setText("Click count: " + clickCount);
            }
        });
        //btOK.setOnAction(new InnerOKButtonListener());




        Button[] numButtons = new Button[5];
        for (int i = 0; i < numButtons.length; i++)
        {
            numButtons[i] = new Button(""+i);
        }

        GridPane pane = new GridPane();
        pane.add(numButtons[0], 0,0);
        pane.add(numButtons[1], 2,0);
        pane.add(numButtons[2], 0,2);
        pane.add(numButtons[3], 2,2);
        pane.add(numButtons[4], 1,1);

        BorderPane masterPane = new BorderPane();
        //masterPane.setTop(clickLabel);
        masterPane.setCenter(btOK);
        //masterPane.setBottom(pane);

        Label mouseStatus = new Label("Mouse coords:");
        masterPane.setLeft(mouseStatus);

        Scene scene = new Scene(pane, 800, 600);
        scene.setOnMouseMoved(m -> {
            double x = m.getX();
            double y = m.getY();
            mouseStatus.setText("Mouse coords: (" + x + ", "+ y + ")");
        });

        mouseStatus.setOnMouseEntered(m -> {
            mouseStatus.setText("HEY " + mouseStatus.getText());
        });

        scene.setOnKeyPressed(k->{
            System.out.println(k.getText());
            if (k.getCode()== KeyCode.A)
            {
                System.out.println("AAAAAAAAA");
            }
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First JavaFX Window");
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
