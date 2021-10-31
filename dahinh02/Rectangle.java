import java.text.DecimalFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

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

    /**
     * Constructor with topLeft, width, length, color, filled.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
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

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        boolean c1 = Double.compare(rectangle.width, width) == 0;
        boolean c2 = Double.compare(rectangle.length, length) == 0;
        boolean c3 = Objects.equals(topLeft, rectangle.topLeft);
        return c1 && c2 && c3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    @Override
    public double getArea() {
        return (double) this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (double) 2 * (this.width + this.length);
    }

    DecimalFormat df = new DecimalFormat("##.0"); // in ra 1 só thập phân sau dấu phẩy

    @Override
    public String toString() {
        String res = "Rectangle[topLeft=(";
        res += df.format(topLeft.getPointX()) + "," + df.format(topLeft.getPointY());
        res += "),width=" + df.format(width) + ",length=" + df.format(length);
        res += ",color=" + color + ",filled=" + filled + ']';
        return res;
    }
}
