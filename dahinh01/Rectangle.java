import java.lang.AssertionError;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Constructor.
     */
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor with width, length, color, filled.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (double) this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (double) 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + ']';
    }
}
