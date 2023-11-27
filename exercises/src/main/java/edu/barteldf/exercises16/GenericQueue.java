package edu.barteldf.exercises16;
import java.util.ArrayList;

public class GenericQueue<T>
{
    private ArrayList<T> data = new ArrayList<>();
    public int getSize()
    {
        return this.data.size();
    }

    public void enqueue(T obj)
    {
        this.data.add(obj);
    }

    public T dequeue()
    {
        if (getSize()>0)
        {
            //T obj = data.remove(0);
            return data.remove(0);
        }
        else
        {
            return null;
        }
    }

    public T peek()
    {
        if (getSize()>0)
        {
            return this.data.get(0);
        }
        else
        {
            return null;
        }
    }

    public boolean isEmpty()
    {
        return (getSize()==0);
    }

    public String toString()
    {
        return this.data.toString();
    }

}
