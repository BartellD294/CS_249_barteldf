package edu.barteldf.exercises18;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class OKButtonListener implements EventHandler<ActionEvent>
{
    private BasicFX boss;
    public OKButtonListener(BasicFX boss)
    {
        this.boss = boss;
    }
    public void handle(ActionEvent event)
    {
        Node n = (Node)event.getSource();
        if (n instanceof Button b)
        {
            b.setText(b.getText() + "!");
            System.out.println("Button pressed!");
            int cnt = boss.getClickCount();
            cnt += 1;
            boss.setClickCount(cnt);
        }
    }
}
