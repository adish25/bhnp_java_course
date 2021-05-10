package DEV266;

import org.w3c.dom.css.Counter;

import java.awt.*;

public class Tiger extends Critter {

    private int moveCount;
    private Color currColor;

    public Tiger() {
        this.moveCount = 0;
        this.currColor = getColor();
    }

    public Color getCurrColor() {
        return currColor;
    }

    public void setCurrColor(Color currColor) {
        this.currColor = currColor;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public void incMoveCount() {
        this.moveCount++;
    }

    public Action getMove(CritterInfo info) {
        /*
        always infect if an enemy is in front,
        otherwise if a wall is in front or to the right, then turn left,
        otherwise if a fellow Tiger is in front, then turn right,
        otherwise hop.
         */

        incMoveCount();

        if (info.getFront().equals(Neighbor.OTHER)) {
            return Action.INFECT;
        }

        if (info.getFront().equals(Neighbor.WALL) ||
                info.getRight().equals(Neighbor.WALL)) {
            return Action.LEFT;
        }

        if (info.getFront().equals(Neighbor.SAME)) {
            return Action.RIGHT;
        }

        return Action.HOP;
    }

    public Color getColor() {
        /*
        Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE)
        and uses that color for three moves,
        then randomly picks one of those colors again for the next three moves,
        then randomly picks another one of those colors for the next three moves,
        and so on.
         */
        if (getMoveCount() % 3 > 0) {
            return getCurrColor();
        }
        switch ((int) Math.random() * (3)) {
            case 0:
                setCurrColor(Color.RED);
                break;
            case 1:
                setCurrColor(Color.GREEN);
                break;
            case 2:
                setCurrColor(Color.BLUE);
                break;
            default:
                break;
        }
        return getCurrColor();
    }

    public String toString() {
        return "TGR";
    }
}
