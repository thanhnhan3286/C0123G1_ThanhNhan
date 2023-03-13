package ss6_inheritance.bai_tap.lop_point_va_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(5, 6);
        MoveablePoint moveablePoint = new MoveablePoint(4, 2, 1, 2);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
