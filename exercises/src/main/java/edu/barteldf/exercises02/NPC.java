package edu.barteldf.exercises02;

public class NPC {
    private int health = 100;

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
        health = Math.max(health, 0);
        health = Math.min(health, 100);
    }
}
