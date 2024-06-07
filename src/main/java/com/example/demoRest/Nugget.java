package com.example.demoRest;

public class Nugget
{
    private int taste;
    private String nname;
    private int amount;
    //default constructor
    public Nugget()
    {

    }
    //constructor using fields
    public Nugget(int taste, String nname, int amount)
    {
        super();
        this.taste = taste;
        this.nname = nname;
        this.amount = amount;
    }
    //getters and setters
    public int getTaste() {return taste;}
    public void setTaste(int taste) {this.taste = taste;}
    public String getNname() {return nname;}
    public void setNname(String pname) {this.nname = pname;}
    public double getAmount() {return amount;}
    public void setPrice(int amount)
    {
        this.amount = amount;
    }

}
