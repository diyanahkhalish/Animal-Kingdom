
import java.awt.*;

public class WhiteTiger extends Critter {
    private boolean infected;

    public WhiteTiger() {
        infected = false;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return infected ? "TGR" : "tgr";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            infected = true;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}