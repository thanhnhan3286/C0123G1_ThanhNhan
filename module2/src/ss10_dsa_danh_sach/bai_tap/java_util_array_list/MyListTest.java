package ss10_dsa_danh_sach.bai_tap.java_util_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.get(3));
        System.out.println(list.get(8));
        display(list.getElements());
        System.out.println("element 4: " + list.get(4));
        System.out.println("element 1: " + list.get(1));
        System.out.println("element 3: " + list.get(2));
        MyList<String> clone = list.clone();
        System.out.println("Trong mảng có B không?");
        System.out.println(clone.contain("B"));
        System.out.println(clone.size());
        list.remove(2);
        System.out.println("Sau remove:");
        display(list.getElements());

    }

    static void display(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println("elment " + i + ": " + list[i]);
            }
        }
    }
}
