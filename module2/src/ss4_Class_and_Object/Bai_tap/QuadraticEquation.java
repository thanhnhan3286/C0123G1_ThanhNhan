package ss4_Class_and_Object.Bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }

    public String getRoot1() {
        double r = 0;
        r = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
        return ("The equation has one root: " + r);
    }

    public String getRoot2() {
        double r1 = 0;
        double r2 = 0;
        r1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
        r2 = (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
        return ("The equation has two roots: " + r1 + " and " + r2);
    }

    public String getRoot3() {
        return ("The equation has no roots");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(quadraticEquation.getRoot2());
        } else {
            System.out.println(quadraticEquation.getRoot3());
        }
    }
}