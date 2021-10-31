import java.text.DecimalFormat;
import java.util.Objects;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point point, double side, String color, boolean filled) {
        super(point, side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Square square = (Square) o;
        return Objects.equals(df, square.df);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), df);
    }

    DecimalFormat df = new DecimalFormat("##.0"); // in ra 1 só thập phân sau dấu phẩy

    @Override
    public String toString() {
        String res = "Square[topLeft=(";
        res += df.format(topLeft.getPointX()) + "," + df.format(topLeft.getPointY());
        res += "),side=" + df.format(getSide());
        res += ",color=" + color + ",filled=" + filled + "]";
        return res;
    }
}