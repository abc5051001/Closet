/**
 * @author Shawn
 * @version 1.0
 */
public class Legging extends Pants {
    public Legging(int size, String color, String fit) {
        super("Legging", size, color, fit);
    }

    @Override
    public String getType() {
        return ("Legging");
    }
} // same thing
