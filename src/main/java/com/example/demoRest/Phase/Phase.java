package com.example.demoRest.Phase;

public class Phase {
    enum PhaseType {
        Upgrade, Programming, Activation
    }

    private PhaseType currentPhase;
    //def constr
    public Phase() {  }
    //constructor
    public Phase(PhaseType currentPhase) {this.currentPhase = currentPhase;}

    // get/set
    public PhaseType getPhase() {return currentPhase;}
    public void setPhase(PhaseType currentPhase) {this.currentPhase = currentPhase;}
}

/*
public class Phase {
    enum phase {
        Programming, Exe, play, idle
    }
    //default constructor
    public Phase()
    {

    }
    //constructor using fields
    public Phase(enum currentPhase)
    {
        super();
        this.phase = currentPhase;
    }
    //getters and setters
    public int getPhase() {return phase;}
    public void setPhase(int taste) {this.phase = currentPhase;}


}
*/