package edu.barteldf.exercises16;

public class DataHolder<E>
{
    private E data;
    public DataHolder(E data)
    {
        this.data = data;
    }
    public E getData()
    {
        return this.data;
    }
}
