/**
 * @author Shawn
 * @version 1.0
 */
public abstract class Tops implements Clothing {
    private String type;
    private int size;
    private String color;

    Tops(String t, int s, String c) {
        this.type = t;
        this.size = s;
        this.color = c;
    }

    public void setType(String s) {
        this.type = s;
    }

    public String getType() {
        return (this.type);
    }

    public void setSize(int i) {
        this.size = i;
    }

    public int getSize() {
        return (this.size);
    }

    public void setColor(String s) {
        this.color = s;
    }

    public String getColor() {
        return (this.color);
    }

    @Override
    public String toString() {
        String x = "";
        x = String.format("Type: %s Size: %d Color: %s", getType(), getSize(), getColor());
        return (x);
    }
} // setters getters and tostring
