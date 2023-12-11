package edu.barteldf.exercises19;

public class Oven extends Appliance
{
    public Oven(int wattage)
    {
        super(wattage);
    }
    public void printType()
    {
        System.out.println("OVEN");
    }
    public void run(double hours)
    {
        System.out.println("COOKING FOR " + hours + " HOURS!");
        double energy = calculateEnergyUsage(getWattage(), hours);
        System.out.println("USED " + energy + " WATT-HOURS!");
    }
}
