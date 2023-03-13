package ss6_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius= " + getRadius() +
                ", color= " + getColor() +
                ", height=" + getHeight() +
                '}' + "\n" + "Volume= " + getVolume();
    }
}
