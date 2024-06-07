package com.example.demoRest;

import java.util.List;

public interface INuggets
{
    List<Nugget> findAll();
    public Nugget getNuggetByTaste(int taste);
    boolean addNugget(Nugget n);


}