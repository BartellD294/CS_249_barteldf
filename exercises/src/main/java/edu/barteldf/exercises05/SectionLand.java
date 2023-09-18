package edu.barteldf.exercises05;

public class SectionLand
{
    public static void main(String [] args)
    {
        int totalFood = 100;

        boolean enoughFood = (totalFood > 0);
        System.out.println("Enough?: " + enoughFood);
        totalFood -=200;
        enoughFood = (totalFood > 0);
        System.out.println("Enough again?: " + enoughFood);
        System.out.println("Total food: " + totalFood);
    }
}
