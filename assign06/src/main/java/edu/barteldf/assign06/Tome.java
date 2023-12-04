package edu.barteldf.assign06;
import java.util.Scanner;

public class Tome extends Item
{
    private String skill = "";
    public Tome(){}
    public Tome(String ID, int value, String skill)
    {
        super(ID, value);
        this.setSkill(skill);
    }

    public String getSkill() {return this.skill;}
    public void setSkill(String skill) {this.skill = skill;}
    public void read() {System.out.println("Skill " + skill + " increased!");}
    public String toString() {return (super.toString() + ", enhances " + this.skill);}

    public void load(Scanner input) throws GameFileException
    {
        try
        {
            super.load(input);
            this.setSkill(input.next());
        }
        catch (Exception e)
        {
            setValue(0);
            setID("");
            this.setSkill("");
            throw new GameFileException("Error loading Tome", e);
        }
    }
}
