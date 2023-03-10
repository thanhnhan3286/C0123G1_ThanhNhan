package ss4_class_and_object.bai_tap;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    int speed = slow;
    boolean on = false;
    String color = "Blue";
    double radius = 5;

    public Fan() {
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        String status = "";
        if (this.isOn()) {
            status += "Fan is on\n";
            status += "Speed: " + getSpeed() + "\n";
        } else {
            status += "Fan is off \n";
        }
        status += "Color: " + getColor() + "\n";
        status += "Radius: " + getRadius() + "\n";
        return status;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setOn(true);
        fan1.setColor("yellow");
        fan1.setRadius(5);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
