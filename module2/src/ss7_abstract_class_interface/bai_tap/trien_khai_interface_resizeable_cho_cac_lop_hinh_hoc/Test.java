package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();
        double randomDouble = Math.random()*100;
        System.out.println(randomDouble);
        int randomInt = (int) randomDouble +1;
        System.out.println("Tỷ lệ phần trăm tăng lên: ");
        System.out.println(randomInt);
        for(Shape e : arr){
            System.out.println("Trước khi tăng");
            System.out.println(e);
            e.resize(randomInt);
            System.out.println("Sau khi tăng");
            System.out.println(e);
        }
    }
}
