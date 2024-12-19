import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private int moves;
    private Color color;
    private static final Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE};
    private Random rand;

    public Tiger() {
        rand = new Random();
        color = COLORS[rand.nextInt(COLORS.length)];
        moves = 0;
    }

    public Color getColor() {
        if (moves % 3 == 0) {
            color = COLORS[rand.nextInt(COLORS.length)];
        }
        moves++;
        return color;
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
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