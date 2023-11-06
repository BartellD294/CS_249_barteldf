package edu.barteldf.exercises13;

public class Face
{
    private int index0, index1, index2;
    public Face()
    {

    }
    public Face(int i0, int i1, int i2)
    {
        this.index0 = i0;
        this.index1 = i1;
        this.index2 = i2;
    }

    public int getIndex(int index)
    {
        return switch(index)
        {
            case 0 -> this.index0;
            case 1 -> this.index1;
            case 2 -> this.index2;
            default -> -1;
        };
    }
    public void setIndex(int index, int value)
    {
        switch (index)
        {
            case 0 -> this.index0 = value;
            case 1 -> this.index1 = value;
            case 2 -> this.index2 = value;
            default -> {}
        }
    }
    public String toString()
    {
        return ("f " + index0 + " " + index1 + " " + index2);
    }
}
