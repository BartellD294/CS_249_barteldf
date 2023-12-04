package edu.barteldf.assign06;
import java.util.Scanner;

public abstract class Creature implements Loadable, Drawable
{
    private int row = 0;
    private int col = 0;

    protected Creature(){}
    protected Creature(int row, int col)
    {
        this.setRow(row);
        this.setCol(col);
    }


    public int getRow() {return this.row;}
    public int getCol() {return this.col;}
    public void setRow(int row) {this.row = row;}
    public void setCol(int col) {this.col = col;}

    public void load(Scanner input) throws GameFileException
    {
        try
        {
            this.setRow(input.nextInt());
            this.setCol(input.nextInt());
        }
        catch (Exception e)
        {
            this.setRow(0);
            this.setCol(0);
            throw new GameFileException("Error loading Creature", e);
        }
    }
}
