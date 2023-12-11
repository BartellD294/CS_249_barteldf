package edu.barteldf.exercises19;

public class Secret {
    int s = 7;

    public void printSecret(int s) {
        System.out.println(s);
    }

    public static void main(String [] args) {
        Secret mySecret = new Secret();
        mySecret.printSecret(12);
    }
}