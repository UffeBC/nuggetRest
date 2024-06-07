package com.example.demoRest;

import java.util.List;

public interface IBoard {
        List<Space> findAll();
        public Space getNuggetByTaste(int taste);
        boolean addSpace(Space n);
}
