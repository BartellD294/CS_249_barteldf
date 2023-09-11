package edu.barteldf.exercises02;

public class NPC {
    private int health = 100;

    private char relationship = 'N';

    public NPC() {}

    public NPC(int h, char r)        //JUST "public <name of class>", nothing else
    {
        health = h;
        relationship = r;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int h)
    {
        health = h;
        health = Math.max(health, 0);
        health = Math.min(health, 100);
    }

    public char getRelationship()
    {
        return relationship;
    }

    public boolean setRelationship(char r)
    {
        boolean valid = false;
        //F = friend, N = neutral, E = enemy
        r = Character.toUpperCase(r);
        if ((r=='F')||(r=='N')||(r=='E'))
        {
            relationship=r;
            valid = true;
        }
        return valid;
    }
}
