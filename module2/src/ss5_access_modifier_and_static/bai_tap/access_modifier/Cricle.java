package ss5_access_modifier_and_static.bai_tap.access_modifier;

import java.util.Scanner;

public class Cricle {
    private double radius = 1;
    String color = "red";

    public Cricle() {
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public String display() {
        return "Diện tích hình tròn (màu " + getColor() + ") là: " + getArea();
    }


}
