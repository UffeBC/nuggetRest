package com.example.demoRest.Phase;


import org.springframework.stereotype.Service;

import static com.example.demoRest.Phase.Phase.PhaseType.*;

@Service
public class PhaseService implements IPhase {
    //creating an object Phase
    Phase phase = new Phase();

    @Override
    public Phase getCurrentPhase() {
        return this.phase;
    }

    @Override
    public boolean nextPhase(Phase p) {
        switch (p.getPhase()) {
            case Upgrade:
                p.setPhase(Activation); // Change == to = to assign the value
                this.phase = p;  // Update the instance variable with the new phase
                return true;  // Indicate that the update was successful
            case Activation:
                p.setPhase(Programming);
                this.phase = p;
                return true;
            case Programming:
                p.setPhase(Upgrade);
                this.phase = p;
                return true;
            default:
                return false;
        }
    }
}
