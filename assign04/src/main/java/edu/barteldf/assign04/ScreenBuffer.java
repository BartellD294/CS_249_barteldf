package edu.barteldf.assign04;

public class ScreenBuffer
{
    private char[][] charArray;
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    public ScreenBuffer(int rowCnt, int colCnt, char fillChar)
    {
        charArray = new char[rowCnt][colCnt];
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        this.clear();
    }

    public void clear()
    {
        for (int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                this.charArray[i][j] = this.fillChar;
            }
        }
    }
    public int getRowCnt()
    {
        return this.rowCnt;
    }
    public int getColCnt()
    {
        return this.colCnt;
    }
    public boolean isValidPosition(int row, int col)
    {
        if ((row<rowCnt && row >= 0)&&(col<colCnt && col >= 0))
            return true;
        else
            return false;
    }
    public char getPos(int row, int col)
    {
        if (isValidPosition(row, col))
            return this.charArray[row][col];
        else
            return ' ';
    }
    public boolean setPos(int row, int col, char c)
    {
        if (isValidPosition(row, col))
        {
            this.charArray[row][col]=c;
            return true;
        }
        else
            return false;
    }
    public String toString()
    {
        return (this.rowCnt + " x " + this.colCnt + " ScreenBuffer (default: " + this.fillChar + ")"
        );
    }
    public String getDisplayString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.rowCnt; i++)
        {
            for (int j = 0; j < this.colCnt; j++)
            {
                sb.append(this.charArray[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

