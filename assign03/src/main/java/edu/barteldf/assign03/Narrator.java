package edu.barteldf.assign03;

public class Narrator
{
    private final int CARD_WIDTH = 50;
    private final int CARD_HEIGHT = 8;
    private String [] lines;
    private char boundaryChar;
    public Narrator(String [] lines, char boundaryChar)
    {
        setBoundaryChar(boundaryChar);
        setLines(lines);
    }
    public char getBoundaryChar()
    {
        return boundaryChar;
    }
    public String getLines()
    {
        StringBuilder sb = new StringBuilder();
        for (String str:lines)
        {
            sb.append(str);
            sb.append("\n");
        }
        return sb.toString();
    }
    public void setBoundaryChar(char boundaryChar)
    {
        this.boundaryChar = boundaryChar;
    }
    public void setLines(String [] inLines)
    {
        this.lines = new String [inLines.length];
        for (int i = 0; i<this.lines.length;i++)
        {
            this.lines[i]=inLines[i];
        }
    }
    public String generateBoundaryLine()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<CARD_WIDTH;i++)
        {
            sb.append(boundaryChar);
        }
        sb.append("\n");
        return sb.toString();
    }
    public String generateCenteredLine(String text)
    {
        int numSpacesNeeded, firstHalfSpaces, secondHalfSpaces;
        StringBuilder sb = new StringBuilder();
        sb.append(boundaryChar);
        numSpacesNeeded = CARD_WIDTH - text.length()-2;
        firstHalfSpaces = numSpacesNeeded/2;
        secondHalfSpaces = numSpacesNeeded-firstHalfSpaces;
        for (int i = 0; i<firstHalfSpaces;i++)
        {
            sb.append(" ");
        }
        sb.append(text);
        for (int i = 0; i<secondHalfSpaces;i++)
        {
            sb.append(" ");
        }
        sb.append(boundaryChar);
        sb.append("\n");
        return sb.toString();
    }
    public String toString()
    {
        int lineCount;
        int extraLineCount;
        int linesLeft;
        StringBuilder sb = new StringBuilder();
        for (int lineNum = 0; lineNum < lines.length; lineNum += 4)
        {
            linesLeft = lines.length-lineNum-1;
            sb.append(generateBoundaryLine());
            sb.append(generateCenteredLine(" "));
            if (linesLeft < 4)
            {
                lineCount = linesLeft;
                extraLineCount = 4-linesLeft;
            }
            else
            {
                lineCount = 4;
                extraLineCount = 0;
            }
            for (int j = 0; j<lineCount;j++)
            {
                sb.append(lines[lineNum+j]);
            }
            for (int j = 0; j<extraLineCount;j++)
            {
                sb.append(generateCenteredLine(" "));
            }
            sb.append(generateCenteredLine(" "));
            sb.append(generateBoundaryLine());
        }
        return sb.toString();
    }
}