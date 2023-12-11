package edu.barteldf.exercises19;

public abstract class Appliance
{
    private int wattage = 0;
    protected Appliance(int w)
    {
        this.wattage = w;
    }
    public int getWattage()
    {
        return this.wattage;
    }
    public void printType()
    {
        System.out.println("UNKNOWN");
    }
    public static double calculateEnergyUsage(int wattage, double hours)
    {
        return (wattage * hours);
    }
    public abstract void run(double hours);
}