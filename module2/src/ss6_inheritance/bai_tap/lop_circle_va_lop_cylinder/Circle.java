package ss6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    protected double radius = 1;
    protected String color = "blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
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

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + getRadius() +
                ", color= " + getColor() +
                "}\n" + "Area= " + getArea() + "\n" + "Perimeter= " + getPerimeter();
    }
}
