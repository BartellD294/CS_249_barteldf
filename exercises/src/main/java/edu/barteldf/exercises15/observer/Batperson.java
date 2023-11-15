package edu.barteldf.exercises15.observer;

public class Batperson implements Observer
{
    private String name;

    public Batperson(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }

    @Override
    public void update(Subject s)
    {
        if (s instanceof Batsignal)
        {
            System.out.println("This is " + name + ", responding to " + ((Batsignal) s).getActiveCrime());
        }
        //System.out.println("This is " + name + ", responding to " + Batsignal(s).ActiveCrime);
    }
}
