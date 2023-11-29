package edu.barteldf.assign06;
import java.util.Scanner;

public class Item implements Loadable
{
    private String ID = "";
    private int value = 0;
    public Item(){}
    public Item(String ID, int value)
    {
        this.setID(ID);
        this.setValue(value);
    }

    public String getID() {return this.ID;}
    public int getValue() {return this.value;}
    public void setID(String ID) {this.ID = ID;}
    public void setValue(int value) {this.value = value;}
    public String toString() {return (this.ID + " with value " + this.value);}

    public void load(Scanner input) throws GameFileException
    {
        try
        {
            this.setID(input.next());
            this.setValue(input.nextInt());
        }
        catch (Exception e)
        {
            this.setID("");
            this.setValue(0);
            throw new GameFileException("Error loading item", e);
        }
    }
}
