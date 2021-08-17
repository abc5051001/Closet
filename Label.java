/**
 * @author Shawn
 * @version 1.0
 */
public class Label<Type1, Type2> {
    private Type1 key;
    private Type2 value;

    // label has key and value and need to define what types they are
    Label(Type1 one, Type2 two) {
        this.key = one;
        this.value = two;
    }

    public void setKey(Type1 one) {
        this.key = one;
    }

    public Type1 getKey() {
        return (this.key);
    }

    public void setValue(Type2 two) {
        this.value = two;
    }

    public Type2 getValue() {
        return (this.value);
    }

    public String toString() {
        return (key + " " + value);
    }
    // setters and getters
}
