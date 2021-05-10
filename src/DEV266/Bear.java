package DEV266;

import java.awt.*;

public class Bear extends Critter {

    private boolean isPolar;
    private String bearRep;

    public Bear() {
        this.isPolar = RandomSingleton.getInstance().nextBoolean();
    }

    public Bear(boolean isPolar) {

        this.isPolar = isPolar;
        this.bearRep = "/";
    }

    public boolean isPolar() {
        return isPolar;
    }

    public void setPolar(boolean polar) {
        isPolar = polar;
    }

    public String getBearRep() {
        return bearRep;
    }

    public void setBearRep(String bearRep) {
        this.bearRep = bearRep;
    }

    public void setNextBearRep() {
        if (getBearRep().equals("/")) {
            setBearRep("\\");
        }
        else {
            setBearRep("/");
        }
    }

    public Action getMove(CritterInfo info) {
        /*
        always infect if an enemy is in front,
        otherwise hop if possible,
        otherwise turn left.
         */
        setNextBearRep();

        if (info.getFront().equals(Neighbor.OTHER)) {
            return Action.INFECT;
        }

        if (info.getFront().equals(Neighbor.EMPTY)) {
            return Action.HOP;
        }

        return Action.LEFT;
    }

    public Color getColor() {
        /*
        Color.WHITE for a polar bear (when polar is true),
        Color.BLACK otherwise (when polar is false)
         */
        if (isPolar) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() {
        return getBearRep();
    }
}
