public class Circle {
    protected static final double PI = 3.14;

    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle[radius=r,color=c]";
    }
}