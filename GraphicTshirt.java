/**
 * @author Shawn
 * @version 1.0
 */

public class GraphicTshirt extends Tops {
    private Graphic info;

    // new private field
    GraphicTshirt(Graphic g, int size, String color) {
        super("Graphic T-Shirt", size, color);
        this.info = g;
    } // graphictshirt extends top so we call the constructor by using super and
      // update info

    @Override
    public String getType() {
        return ("Graphic T-Shirt");
    }

    // override the gettype method
    @Override
    public String toString() {
        String x = super.toString();
        String y = String.format(" Graphic Style: %s Graphic Description: %s", info.getStyle(), info.getDescription());
        return (x + y);

    } // same to string
}
