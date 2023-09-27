package edu.barteldf.assign02;

public class Superhero
{
    private String heroName = "";
    private String realName = "";
    private int height = 0;
    private double weight = 0.0;

    public String getHeroName()
    {
        return heroName;
    }
    public String getRealName()
    {
        return realName;
    }
    public int getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setHeroName(String name)
    {
        heroName = name;
    }
    public void setRealName(String name)
    {
        realName = name;
    }
    public void setHeight(int totalInches)
    {
        height = totalInches;
    }
    public void setWeight(double pounds)
    {
        weight = pounds;
    }
    public int calculateBMI()
    {
        //TODO
        return 0;
    }
    public String getNameString()
    {
        //TODO
        return "";
    }
}
