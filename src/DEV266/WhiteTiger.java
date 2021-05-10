package DEV266;

import java.awt.*;

public class WhiteTiger extends Tiger {

    private String currTigerRep;

    public WhiteTiger() {
        setCurrTigerRep("tgr");
    }

    public String getCurrTigerRep() {
        return currTigerRep;
    }

    public void setCurrTigerRep(String currTigerRep) {
        this.currTigerRep = currTigerRep;
    }

    public Action getMove(CritterInfo info) {
        /*
        Same as a Tiger.
        Note: you’ll have to override this method to figure out if it has infected another Critter.
         */
        Action result = super.getMove(info);
        if (result.equals(Action.INFECT)) {
            setCurrTigerRep("TGR");
        }
        return result;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return getCurrTigerRep();
    }
}
