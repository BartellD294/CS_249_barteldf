package edu.barteldf.exercises15.observer;

import java.util.ArrayList;

public class Batsignal implements Subject
{
    private String activeCrime = "";
    private ArrayList<Observer> crimeFighters = new ArrayList<>();

    @Override
    public void registerObserver(Observer ob)
    {
        this.crimeFighters.add(ob);
    }

    @Override
    public void removeObserver(Observer ob)
    {
        this.crimeFighters.remove(ob);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer ob: this.crimeFighters)
        {
            ob.update(this);
        }
    }

    public String getActiveCrime()
    {
        return this.activeCrime;
    }

    public void setActiveCrime(String crime)
    {
        this.activeCrime = crime;
        notifyObservers();
    }
}
