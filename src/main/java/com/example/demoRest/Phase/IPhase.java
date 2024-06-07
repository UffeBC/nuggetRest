package com.example.demoRest.Phase;

import com.example.demoRest.Nugget;
import com.example.demoRest.Phase.Phase;
import com.example.demoRest.Product;

import java.util.List;

public interface IPhase
{
    //Phase getAll();
    public Phase getCurrentPhase();
    public boolean nextPhase(Phase p);
}