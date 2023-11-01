package edu.realemj.exercises13;

import java.util.*;
import java.io.*;

public class Quotient {

    public static void badFileStuff() throws IOException {
        throw new IOException("NOPE!");
    }
    public static int quotient(int number1, int number2) {
        if(number2 == 0) {
            throw new ArithmeticException("YOU FOOL! YOU SHALL TEAR THE UNIVERSE ASUNDER!");
        }

        return number1/number2;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int x = input.nextInt();
            int y = input.nextInt();
            int z = quotient(x, y);
            System.out.println("Answer is: " + z);

            badFileStuff();
        }
        catch(ArithmeticException e) {
            System.err.println("SOMETHING HAS GONE AWRY!!!");
            System.err.println(e.getMessage());
        }
        catch(InputMismatchException e) {
            System.err.println("THAT'S NOT A NUMBER!!!!");
        }
        catch(IOException e) {
            System.err.println("Huh...that's odd.");
        }

        System.out.println("DONE!");
    }
}
