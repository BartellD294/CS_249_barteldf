package edu.barteldf.exercises15.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double getCost() {
        return 3.99;
    }
}
