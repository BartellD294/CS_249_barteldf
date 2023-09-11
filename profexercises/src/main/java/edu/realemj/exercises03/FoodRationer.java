package edu.realemj.exercises03;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total food:");
        double totalFood = input.nextDouble();
        int partyCnt = 5;
        double rations = 10.0;

        double daysLeft = totalFood/(rations*partyCnt);

        System.out.println("DAYS LEFT: " + daysLeft);
    }
}
