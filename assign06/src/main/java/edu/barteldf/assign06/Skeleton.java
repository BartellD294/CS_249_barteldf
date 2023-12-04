package edu.barteldf.assign06;
import edu.barteldf.assign04.ScreenBuffer;

public class Skeleton extends Creature // also implements Drawable but that's implied
{
    public Skeleton(){}
    public Skeleton(int row, int col) {super(row, col);}
    public String toString() {return ("Skeleton at " + getRow() + "," + getCol());}
    public void draw(ScreenBuffer map)
    {
        map.setPos(getRow(), getCol(), 'S');
    }
}
