/**
 * @author Shawn
 * @version 1.0
 */
public class Jeans extends Pants {
    private JEANFIT jeanfit;

    public Jeans(int size, String color, JEANFIT j) {
        super("Jeans", size, color, j.name());
        this.jeanfit = j;
    }

    @Override
    public String getType() {
        return ("Jeans");
    }

    @Override
    public String getFit() {
        return (this.jeanfit.name());
    }
    // same as the others
}
