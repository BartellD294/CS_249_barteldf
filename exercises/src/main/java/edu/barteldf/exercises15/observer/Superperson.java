package edu.barteldf.exercises15.observer;

public class Superperson implements Observer
{
    private String name;

    public Superperson(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Subject s)
    {
        if (s instanceof Batsignal)
        {
            System.out.println("This is " + this.name + ", responding to " + ((Batsignal) s).getActiveCrime());
        }
    }
}
