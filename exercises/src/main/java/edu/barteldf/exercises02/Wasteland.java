package edu.barteldf.exercises02;

public class Wasteland {
    public static void main(String [] args) {

        System.out.println("I don't want to set the world on fire...");

        NPC bob = new NPC();
        NPC sue = new NPC();

        int h = bob.getHealth();
        h -= 5;
        bob.setHealth(h);

    }
}
