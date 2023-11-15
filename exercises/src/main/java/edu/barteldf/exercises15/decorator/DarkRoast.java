package edu.barteldf.exercises15.decorator;

public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        super("Dark Roast");
    }

    @Override
    public double getCost()
    {
        return 2.99;
    }
}
