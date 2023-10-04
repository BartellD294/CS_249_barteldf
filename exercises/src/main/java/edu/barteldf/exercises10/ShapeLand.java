package edu.barteldf.exercises10;

import edu.barteldf.exercises09.Matrix;

public class ShapeLand
{
    public static void main(String [] args)
    {
        Circle c1 = new Circle();
        c1.setRadius(5.0);

        Matrix T = Matrix.makeTranslation3D(5.0, -2.0, 0.0);
        c1.setCenter(T.multiply(c1.getCenter()));

        System.out.println(c1);
    }
}
