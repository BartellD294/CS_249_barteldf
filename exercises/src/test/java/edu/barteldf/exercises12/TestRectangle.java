package edu.barteldf.exercises12;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRectangle
{

    @DataProvider(name="areaProvider")
    public Object[][] runAreaProvider()
    {
        Object[][] data = {
                {new Rectangle(5,7),35.0},
                {new Rectangle(2,3),6.0},
                {new Rectangle(0,8),0.0}
        };
        return data;
    }
    //@Test(dataProvider = "areaProvider")
    public void test_getArea(Rectangle r, Double area)
    {
        //Rectangle r = new Rectangle(5, 7);
        Assert.assertEquals(r.getArea(), area, "Incorrect area!");
    }

    //@Test
    public void test_toString()
    {
        Rectangle r = new Rectangle(5,7);
        Assert.assertEquals(r.toString(), "");
    }
}
