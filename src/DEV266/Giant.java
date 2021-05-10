package DEV266;

import java.awt.*;

public class Giant extends Critter{

    private final String[] giantRepArr = {"fee", "fie" , "foe" , "fum"};
    private int giantRepInd;
    private MyCounter moveCount;

    public Giant() {
        this.giantRepInd = 0;
        this.moveCount = new MyCounter();
    }

    protected int getGiantRepInd() {
        return giantRepInd;
    }

    protected void setGiantRepInd(int giantRepInd) {
        this.giantRepInd = giantRepInd;
    }

    protected void setNextGiantRepInd() {
        this.giantRepInd++;
        if (this.giantRepInd >= giantRepArr.length) {
            this.giantRepInd = 0;
        }
    }

    public Action getMove(CritterInfo info) {
        /*
        always infect if an enemy is in front,
        otherwise hop if possible,
        otherwise turn right.
         */
        moveCount.incCounter();
        if (moveCount.getCounter()%6 == 0) {
            setNextGiantRepInd();
        }

        if (info.getFront().equals(Neighbor.OTHER)) {
            return Action.INFECT;
        }

        if (info.getFront().equals(Neighbor.EMPTY)) {
            return Action.HOP;
        }

        return Action.RIGHT;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        return this.giantRepArr[getGiantRepInd()];
    }
}
