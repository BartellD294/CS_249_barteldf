package edu.barteldf.assign04;

public class Box
{
    private int sr, sc, er, ec;
    private boolean filled;
    private char drawChar;

    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar)
    {
        this.sr = sr;
        this.sc = sc;
        this.er = er;
        this.ec = ec;
        this.filled = filled;
        this.drawChar = drawChar;
    }

    public String toString()
    {
        if (this.filled)
            return ("Filled Box from ("+sc+","+sr+") to ("+ec+","+er+") with char '"+this.drawChar+"'");
        else
            return ("Box from ("+sc+","+sr+") to ("+ec+","+er+") with char '"+this.drawChar+"'");
    }
    public void draw(ScreenBuffer s)
    {
        if (this.filled)
        {
            for (int i = this.sr; i < this.er; i++)
            {
                for (int j = this.sc; j < this.ec; j++)
                {
                    s.setPos(i,j,this.drawChar);
                }
            }
        }
        else
        {
            for (int i = this.sr; i <= this.er; i++)
            {
                for (int j = this.sc; j <= this.ec; j++)
                {
                    if ((i==this.sr)||(i==this.er)||(j==this.sc)||(j==this.ec))
                    {
                        s.setPos(i,j,this.drawChar);
                    }

                }
            }
        }

    }
}
