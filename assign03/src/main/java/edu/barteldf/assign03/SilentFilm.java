package edu.barteldf.assign03;
import java.util.Scanner;

public class SilentFilm
{
    public static Narrator askForNarration(Scanner input)
    {
        //TODO
        char boundaryCharacter = ' ';
        String [] allLines = {""};
        Narrator newNarrator = new Narrator(allLines, boundaryCharacter);
        return newNarrator;
    }

    public static void main(String [] args)
    {
        //TODO
    }
}
