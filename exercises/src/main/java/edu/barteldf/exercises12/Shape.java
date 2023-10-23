package edu.barteldf.exercises12;
import edu.barteldf.exercises09.*;

public class Shape
{
    private boolean filled;
    private Matrix center = Matrix.makePoint3D(0,0,0);

    public Shape() {}

    public Shape(boolean filled)
    {
        this(Matrix.makePoint3D(0,0,0),filled);
    }

    public Shape(Matrix center)
    {
        this(center,false);
    }
    public Shape(Matrix center, boolean filled)
    {
        setCenter(center);
        setFilled(filled);
    }
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public Matrix getCenter()
    {
        return new Matrix(center);
    }
    public void setCenter(Matrix center)
    {
        this.center = center;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        return "Shape (center = " + center.toPoint3DString()
                + ", filled = " + filled + ")";
    }

}
