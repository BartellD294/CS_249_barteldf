package edu.barteldf.assign06;
import edu.barteldf.assign04.ScreenBuffer;

public class Rat extends Creature // also implements Drawable but that's implied
{
    public Rat(){}
    public Rat(int row, int col) {super(row, col);}
    public String toString() {return ("Rat at " + getRow() + "," + getCol());}
    public void draw(ScreenBuffer map)
    {
        map.setPos(getRow(), getCol(), 'R');
    }
}
