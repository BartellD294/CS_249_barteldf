package edu.barteldf.assign05;

public class Giant
{
    private String name = "";

    public Giant(String name)
    {
        this.setName(name);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    }
}
