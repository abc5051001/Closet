/**
 * @author Shawn
 * @version 1.0
 */
public class Graphic {
    private String style;
    private String description;

    // two private fields
    Graphic(String s, String d) {
        this.style = s;
        this.description = d;
    }

    // constructor passing two fields
    public String getStyle() {
        return (this.style);
    }

    public void setStyle(String s) {
        this.style = s;
    }

    public String getDescription() {
        return (this.description);
    }

    public void setDescription(String d) {
        this.description = d;
    }
    // getters and setters for the two private fields
}
