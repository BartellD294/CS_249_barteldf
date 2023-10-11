package edu.barteldf.assign03;
import java.util.Scanner;

public class SilentFilm
{
    public static Narrator askForNarration(Scanner input)
    {
        char boundaryCharacter;
        int numLines;
        System.out.println("Enter boundary character:");
        boundaryCharacter = input.nextLine().charAt(0);
        System.out.println("Enter number of lines:");
        numLines = Integer.parseInt(input.nextLine());
        String [] allLines = new String [4];
        System.out.println("Enter lines:");
        for (int i = 0; i< numLines;i++)
        {
            allLines[i] = input.nextLine();
        }
        Narrator newNarrator = new Narrator(allLines, boundaryCharacter);
        return newNarrator;
    }

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Narrator n = askForNarration(in);
        System.out.println("Our story begins...");
        System.out.println(n);
    }
}
