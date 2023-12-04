package edu.barteldf.assign06;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import edu.barteldf.assign04.ScreenBuffer;
public class GameState implements Loadable
{
    private ArrayList<Loadable> ls = new ArrayList<>();
    private ScreenBuffer map = new ScreenBuffer(12, 30, '.');
    public Loadable createLoadable(String typeName) throws GameFileException
    {
        switch (typeName)
        {
            case "Skeleton":
                return new Skeleton();
            case "Rat":
                return new Rat();
            case "Item":
                return new Item();
            case "Tome":
                return new Tome();
            default:
                throw new GameFileException("Unknown type: " + typeName);
        }
    }
    public void load(Scanner input) throws GameFileException
    {
        this.map.clear();
        this.ls.clear();

        int numLines = input.nextInt();
        String typeName = "";
        Loadable m;

        for (int i = 0; i < numLines; i++)
        {
            typeName = input.next();
            m = this.createLoadable(typeName);
            m.load(input);
            this.ls.add(m);
            if (m instanceof Drawable)
            {
                ((Drawable) m).draw(this.map);
            }
        }
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n" + this.map.getDisplayString() + "\n" + "CREATURES:\n");
        for (Loadable c: this.ls)
        {
            if (c instanceof Creature)
            {
                sb.append("* " + c.toString() + "\n");
            }
        }
        sb.append("INVENTORY:\n");
        for (Loadable i: this.ls)
        {
            if (i instanceof Item)
            {
                sb.append("* " + i.toString() + "\n");
            }
        }
        return sb.toString();
    }

    public void save(String filename) throws GameFileException
    {
        try
        {
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this.toString());
            writer.close();
        }
        catch (Exception e)
        {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
