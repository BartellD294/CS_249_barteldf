package edu.barteldf.exercises15.singleton;

import java.util.Scanner;

public class SingletonTest {
    public static void main(String [] args) {
        System.out.println("Enter text:");
        Scanner input = UserInputSingleton.getInstance().getScanner();
        String t = input.nextLine();
        System.out.println("You entered: " + t);
    }
}
