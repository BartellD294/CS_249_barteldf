package edu.barteldf.assign02;
import java.util.Scanner;

public class League
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        Superhero p = new Superhero();
        System.out.println("Enter hero name:");
        String heroName = input.nextLine();
        System.out.println("Enter real name:");
        String realName = input.nextLine();
        System.out.println("Enter height (inches) and weight (pounds):");
        String line = input.nextLine();
        Scanner parseLine = new Scanner(line);
        int totalInches = parseLine.nextInt();
        double weight = parseLine.nextDouble();
        p.setHeroName(heroName);
        p.setRealName(realName);
        p.setHeight(totalInches);
        p.setWeight(weight);
        System.out.println(p.toString());
    }
}
