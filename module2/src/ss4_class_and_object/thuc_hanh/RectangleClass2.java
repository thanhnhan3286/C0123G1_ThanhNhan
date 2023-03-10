package ss4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class RectangleClass2 {
    double width, height;
    public RectangleClass2(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{" + "width="+width+", height="+height;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = sc.nextDouble();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();
        RectangleClass2 rectangle = new RectangleClass2(width,height);
        System.out.println("Your rectangle" + rectangle.display());
        System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle: "+ rectangle.getArea());
    }
}
