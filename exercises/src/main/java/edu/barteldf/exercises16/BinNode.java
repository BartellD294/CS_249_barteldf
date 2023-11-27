package edu.barteldf.exercises16;

public class BinNode<E extends Comparable<E>> implements Comparable<BinNode<E>>
{
    private E data;
    private BinNode<E> left;
    private BinNode<E> right;

    public BinNode(E data)
    {
        this.data = data;
    }

    public BinNode<E> getLeft()
    {
        return left;
    }
    public BinNode<E> getRight()
    {
        return right;
    }

    public void setLeft(BinNode<E> other)
    {
        this.left = left;
    }
    public void setRight(BinNode<E> other)
    {
        this.right = right;
    }
    public int compareTo(BinNode<E> other)
    {
        return data.compareTo(other.data);
    }

    public String toString()
    {
        return ("(" + data + ")");
    }
}