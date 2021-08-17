/**
 * @author Shawn
 * @version 1.0
 */
public class Shorts extends Pants {
    Shorts(int size, String color, String fit) {
        super("Shorts", size, color, fit);
    }

    @Override
    public String getType() {
        return ("Shorts");
    }
} // same as others
