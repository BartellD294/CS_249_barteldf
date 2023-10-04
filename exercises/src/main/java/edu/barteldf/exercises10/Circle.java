package edu.barteldf.exercises10;
import edu.barteldf.exercises09.Matrix;

public class Circle
{
    private double radius = 1.0;
    private Matrix center = Matrix.makePoint3D(0,0,0);

    public Circle(){}
    public Circle(double r)
    {
        setRadius(r);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double r)
    {
        if (r>=0)
        {
            radius = r;
        }
    }

    public void setCenter(Matrix other)
    {
        center = new Matrix(other);
    }

    public double getArea()
    {
        return radius*radius;
    }

    public String toString()
    {
        //TODO
        return "";
    }

    public Matrix getCenter()
    {
        return new Matrix(center);
    }
}
