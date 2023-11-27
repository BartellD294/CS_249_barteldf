package edu.barteldf.exercises16;

public class GenericLand
{
    public static void main(String[] args)
    {
        DataHolder<String> s = new DataHolder<>("Hello");
        DataHolder<Integer> i = new DataHolder<>(5);
        String value1 = s.getData();
        Integer value2 = i.getData();
        System.out.println(value1);
        System.out.println(value2);
    }
}
