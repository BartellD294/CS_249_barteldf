package edu.barteldf.assign03;

public class Narrator
{
    private final int CARD_WIDTH = 50;
    private final int CARD_TEXT_HEIGHT = 4; //total card height = 8 though
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
    public void setLines(String [] lines)
    {
        this.lines = new String [lines.length];
        for (int i = 0; i<lines.length;i++)
        {
            this.lines[i]=lines[i];
        }
    }
    public String generateBoundaryLine()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<CARD_WIDTH;i++) //CARD_WIDTH = 50
        {
            sb.append(boundaryChar);
        }
        sb.append("\n");
        return sb.toString();
    }
    public String generateCenteredLine(String text)
    {
        int totalSpaces, firstHalfSpaces, secondHalfSpaces;
        StringBuilder sb = new StringBuilder();
        sb.append(boundaryChar);
        totalSpaces = CARD_WIDTH - text.length()-2; //50-text.length()-2
        firstHalfSpaces = totalSpaces/2;
        secondHalfSpaces = totalSpaces-firstHalfSpaces;
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
        for (int lineNum = 0; lineNum < lines.length; lineNum += CARD_TEXT_HEIGHT) //CARD_TEXT_HEIGHT = 4
        {
            linesLeft = lines.length-lineNum;
            sb.append(generateBoundaryLine());
            sb.append(generateCenteredLine(" "));
            if (linesLeft < CARD_TEXT_HEIGHT) //4
            {
                lineCount = linesLeft;
                extraLineCount = CARD_TEXT_HEIGHT-linesLeft; //4-linesLeft
            }
            else
            {
                lineCount = CARD_TEXT_HEIGHT; //4
                extraLineCount = 0;
            }
            for (int j = 0; j<lineCount;j++)
            {
                sb.append(generateCenteredLine(lines[lineNum+j]));
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