import java.util.Objects;

public class Point {

    private double pointX = 0.0;
    private double pointY = 0.0;

    /**
     * Constructor.
     */
    public Point() {

    }

    /**
     * Constructor.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * calculate.
     */
    public double distance(Point another) {
        double x = this.pointX - another.getPointX();
        double y = this.pointY - another.getPointY();
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        boolean temp = Double.compare(point.pointX, pointX) == 0;
        return temp && Double.compare(point.pointY, pointY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }
}