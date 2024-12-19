import java.awt.*;

public class NinjaCat extends Critter {
    public NinjaCat() {
    }

    public Color getColor() {
        return Color.BLACK;
    }

    public String toString() {
        return "D";
    }

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else if (info.leftThreat()) {
            return Action.LEFT;
        } else {
            return Action.RIGHT;
        }
    }
}