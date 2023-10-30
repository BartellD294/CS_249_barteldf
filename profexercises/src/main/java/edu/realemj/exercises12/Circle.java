package edu.realemj.exercises12;

import edu.realemj.exercises09.*;
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) {
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Matrix center) {
        super(center);
        setRadius(radius);
    }

    public Circle(double radius,
                  Matrix center,
                  boolean filled) {
        super(center, filled);
        setRadius(radius);
        //setCenter(center);
        //setFilled(filled);
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if(radius >= 0.0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        String old = super.toString();
        int pindex = old.indexOf("(");
        old = old.substring(pindex+1);
        return "Circle (radius=" + radius + ", " + old;

        /*
        return "Circle (radius=" + radius
                + ", center="
                + getCenter().toPoint3DString()
                + ", filled="
                + isFilled()
                + ")";
         */
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj instanceof Circle other) {
            final double EPS = 1e-08;
            if(Math.abs(radius - other.radius) < EPS
                && super.equals(other)) {
                // Radii are equal
                isEqual = true;
            }
        }
        return isEqual;
    }
}
