package edu.barteldf.exercises15.observer;

import java.util.ArrayList;
import java.util.Observer;

public class Batsignal implements Subject {
    private String activeCrime = "";
    private ArrayList<java.util.Observer> crimeFighters = new ArrayList<>();

    @Override
    public void registerObserver(java.util.Observer ob) {
        crimeFighters.add(ob);
    }

    @Override
    public void removeObserver(java.util.Observer ob) {
        crimeFighters.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: crimeFighters) {
            ob.update(this);
        }
    }

    public String getActiveCrime() {
        return activeCrime;
    }

    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }
}
