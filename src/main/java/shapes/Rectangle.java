package shapes;

public class Rectangle extends Shape implements Resizeable {
    private double width, length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + width
                + " and length= " + length
                + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() + getLength() * percent);
        setWidth(getWidth() + getWidth() * percent);
    }
}
