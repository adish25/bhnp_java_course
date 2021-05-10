package DEV266;

import java.awt.*;

public class NinjaCat extends Critter{
    public NinjaCat() {

    }

    public class Food extends Critter {
        public Action getMove(CritterInfo info) {
            return Action.INFECT;
        }

        public Color getColor() {
            return Color.PINK;
        }

        public String toString() {
            return "CAT";
        }
    }
}
