package DEV266;// This defines a simple class of critters that infect whenever they can and
// otherwise just spin around, looking for critters to infect.  This simple
// strategy turns out to be surpisingly successful.

import java.awt.*;

public class FlyTrap extends Critter {
    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Critter.Neighbor.OTHER) {
            return Critter.Action.INFECT;
        } else {
            return Critter.Action.LEFT;
        }
    }

    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        return "T";
    }
}