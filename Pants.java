/**
 * @author Shawn
 * @version 1.0
 */
public abstract class Pants implements Clothing, Bottoms {
    private String type;
    private int size;
    private String color;
    private String fit;

    // private fields of pants
    Pants(String t, int s, String c, String f) {
        this.type = t;
        this.size = s;
        this.color = c;
        this.fit = f;
    }

    public void setType(String s) {
        this.type = s;
    }

    @Override
    public String getType() {
        return (this.type);
    }

    public void setSize(int i) {
        this.size = i;
    }

    @Override
    public int getSize() {
        return (this.size);
    }

    public void setColor(String s) {
        this.color = s;
    }

    @Override
    public String getColor() {
        return (this.color);
    }

    public void setFit(String s) {
        this.fit = s;
    }

    public String getFit() {
        return (this.fit);
    }

    @Override
    public String toString() {
        String x = "";
        x = String.format("Type: %s Size: %d Color: %s Fit: %s", getType(), getSize(), getColor(), getFit());
        return (x);
    }
} // setters getters and tostring
