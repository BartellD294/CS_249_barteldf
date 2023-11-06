package edu.barteldf.exercises12;

import edu.barteldf.exercises09.Matrix;
import edu.barteldf.exercises13.InvalidRadiusException;

public class Circle extends Shape
{

    private double radius = 1.0;
    public Circle()
    {
        //super();
    }
    public Circle(double radius) throws InvalidRadiusException
    {
        setRadius(radius);
        //super();
    }

    public Circle(double radius, Matrix center) throws InvalidRadiusException
    {
        super(center);
        setRadius(radius);
    }
    public Circle(double radius, Matrix center, boolean filled) throws InvalidRadiusException
    {
        super(center, filled);
        setRadius(radius);
        //setCenter(center);
        //setFilled(filled);
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius) throws InvalidRadiusException
    {
        if (radius >= 0)
            this.radius = radius;
        else
            throw new InvalidRadiusException("Bad radius: " + radius);
    }
    @Override
    public String toString()
    {
        String old = super.toString();
        int pindex = old.indexOf("(");
        old = old.substring(pindex+1);
        return "Circle (radius" + radius +", " + old;
        /*
        return "Circle (radius = " + radius + ", center =" + getCenter().toPoint3DString()
                + ", filled = " + isFilled() + ")";
         */
    }
}
