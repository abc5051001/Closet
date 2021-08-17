/**
 * @author Shawn
 * @version 1.0
 */
public class TankTop extends Tops {
    private String strapType;

    public TankTop(String strap, int size, String color) {
        super("Tank Top", size, color);
        this.strapType = strap;
    }

    public void setStrapType(String s) {
        this.strapType = s;
    }

    public String getStrapType() {
        return (this.strapType);
    }

    @Override
    public String getType() {
        return ("Tank Top");
    }

    @Override
    public String toString() {
        String x = super.toString();
        String y = String.format(" Strap Type: %s", getStrapType());
        return (x + y);
    }
} // setters,getters,tostring
