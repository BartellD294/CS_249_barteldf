package edu.barteldf.exercises15.strategy;

public class TeddyBear extends Bear {
    public TeddyBear() {
        moveBehavior = new NoMove();
    }
}
