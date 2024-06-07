package com.example.demoRest.Player;

public class Player
{
    private int id;
    private String pname;
    private int x;
    private int y;
    //default constructor
    public Player()
    {

    }
    //constructor using fields
    public Player(int id, String pname, int x, int y)
    {
        super();
        this.id = id;
        this.pname = pname;
        this.x = x;
        this.y = y;
    }
    //getters and setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getPname()
    {
        return pname;
    }
    public void setPname(String pname)
    {
        this.pname = pname;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    public void Location(int x, int y){

    }
}
