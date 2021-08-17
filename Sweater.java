/**
 * @author Shawn
 * @version 1.0
 */
public class Sweater extends Tops {
    private SWEATERTYPE sweaterType;

    public Sweater(SWEATERTYPE s, int size, String color) {
        super("Sweater", size, color);
        this.sweaterType = s;
    }

    @Override
    public String getType() {
        String y = "Sweater(";
        String x = this.sweaterType.name();
        return (y + x + ")");
    }
} // same as others
