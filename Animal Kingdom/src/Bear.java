import java.awt.*;

public class Bear extends Critter {
    private boolean polar;
    private boolean slash;

    public Bear(boolean polar) {
        this.polar = polar;
        this.slash = true;
    }

    public Color getColor() {
        return polar ? Color.WHITE : Color.BLACK;
    }

    public String toString() {
        if (slash) {
            slash = false;
            return "/";
        } else {
            slash = true;
            return "\\";
        }
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}