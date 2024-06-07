package com.example.demoRest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NuggetService implements INuggets {
    //creating an object of ArrayList
    ArrayList<Nugget> nuggets = new ArrayList<Nugget>();

    public NuggetService() {
        //adding products to the List
        nuggets.add(new Nugget(100, "FlashNug", 90));
        nuggets.add(new Nugget(80, "FlashNugut", 50));
        nuggets.add(new Nugget(10, "FlashNugat", 29));

    }

    @Override
    public List<Nugget> findAll() {
        //returns a list of product
        return nuggets;
    }

    @Override
    public Nugget getNuggetByTaste(int taste) {
        for(Nugget n : nuggets) {
            if(n.getTaste() == taste) {
                return n;
            }
        }
        return null;
    }

    @Override
    public boolean addNugget(Nugget n) {
        nuggets.add(n);
        return true;
    }

}