package edu.barteldf.exercises13;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient
{
    public static int quotient(int number1, int number2)
    {
        return number1/number2;
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers:");
            int x = input.nextInt();
            int y = input.nextInt();
            int z = quotient(x, y);
            System.out.println("Answer is: " + z);
        }
        catch(ArithmeticException e)
        {
            System.err.println("SOMETHING HAS GONE AWRY!!!");
            System.err.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.err.println("");
            System.err.println(e.getMessage());
        }
        System.out.println("DONE!");
    }
    private String getMessage()
    {
        return "fndsufnsdnk,error!!!!!";
    }
}
