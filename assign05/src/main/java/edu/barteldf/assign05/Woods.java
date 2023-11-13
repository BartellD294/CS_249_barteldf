package edu.barteldf.assign05;

import java.util.ArrayList;

public class Woods
{
    private ArrayList<Giant> giants = new ArrayList<>();

    public Giant createGiant(String name, String typeName)
    {
        if (name.equals(""))
        {
            return null;
        }
        else
        {
            Giant g;
            switch (typeName)
            {
                case ("GIANT"):
                    g = new Giant(name);
                    break;
                case ("TROLL"):
                    g = new Troll(name);
                    break;
                case ("TREE"):
                    g = new Tree(name);
                    break;
                case ("ENT"):
                    g = new Ent(name);
                    break;
                case ("HUORN"):
                    g = new Huorn(name);
                    break;
                default:
                    return null;
            }
            return g;
        }
    }

    public boolean addGiant(String name, String typeName)
    {
        //Giant myg = this.createGiant(name, typeName);
        if (this.createGiant(name, typeName) != null)
        {
            this.giants.add(this.createGiant(name, typeName));
            return true;
        }
        else
        {
            return false;
        }
    }
    public Giant getGiant(int index)
    {
        if ((index >= 0) && (index < this.giants.size()))
        {
            return this.giants.get(index);
        }
        else
        {
            return null;
        }
    }

    public void printAllGiants()
    {
        System.out.println("ALL GIANTS:");
        for (Giant g: this.giants)
        {
            System.out.println("- " + g.toString());
        }
    }

    public void printAllTrees()
    {
        System.out.println("ALL TREES:");
        for (Giant g: this.giants)
        {
            if (g instanceof Tree)
            {
                System.out.println("- " + g.toString() + ": " + ((Tree) g).speak());
            }
        }
    }

    public void printAllTrolls()
    {
        System.out.println("ALL TROLLS:");
        for (Giant g: this.giants)
        {
            if (g instanceof Troll)
            {
                System.out.println("- " + g.toString() + ": " + ((Troll) g).cook());
            }
        }
    }
}
