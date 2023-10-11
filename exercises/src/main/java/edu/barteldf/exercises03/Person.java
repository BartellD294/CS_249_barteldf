package edu.barteldf.exercises03;

public class Person
{
    private String name = "";
    private boolean alive;
    public Person(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
    public boolean isAlive()
    {
        return alive;
    }
    public void setAlive(boolean isAlive)
    {
       alive = isAlive;
    }

    public String toString()
    {
        String s = name;
        if (!alive)
        {
            s += " (Deceased)";
        }
        return s;
    }
}
