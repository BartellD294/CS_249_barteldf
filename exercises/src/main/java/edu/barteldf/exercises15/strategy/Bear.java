package edu.barteldf.exercises15.strategy;

public abstract class Bear
{
    protected Moveable moveBehavior;

    public void performMove()
    {
        moveBehavior.move();
    }

    public void setMoveBehavior(Moveable m)
    {
        this.moveBehavior = m;
    }
}
