package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[2] = new Rectangle();
        arr[1] = new Square();
        for (Shape e : arr) {
            if (e instanceof Colorable) {
                System.out.println(e);
                ((Colorable) e).howToColor();
            }
        }
    }
}
