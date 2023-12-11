package edu.barteldf.exercises19;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClassA
{
    public static void main(String[] args)
    {
        Appliance stove = new Oven(5000);
        stove.printType();
    }
}
