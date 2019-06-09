package shapes;

public class Shape {
    String color;
    boolean filled;

    Shape() {
        this.color = "green";
        this.filled = true;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return this.color;
    }

    boolean isFilled() {
        return this.filled;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override

    public String toString() {
        return "A Shape with color of " + color
                + " and "
                + (isFilled() ? " filled" : " not filled ");
    }

}