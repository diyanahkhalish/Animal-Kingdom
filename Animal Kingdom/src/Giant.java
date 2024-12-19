import java.awt.*;

public class Giant extends Critter {
    private int moves;
    private String[] names = {"fee", "fie", "foe", "fum"};

    public Giant() {
        moves = 0;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        return names[(moves / 6) % names.length];
    }

    public Action getMove(CritterInfo info) {
        moves++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}