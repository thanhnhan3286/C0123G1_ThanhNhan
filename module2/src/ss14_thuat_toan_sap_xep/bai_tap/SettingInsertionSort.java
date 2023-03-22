package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class SettingInsertionSort {
    public static void main(String[] args) {
        int[] ar1 = {12, 56, 48, 79, 35, 21, 46, 20, 31, 35};
        System.out.println("Mảng 1: " + Arrays.toString(ar1));
        int[] ar2 = {12, 20, 21, 31, 35, 35, 46, 48, 56, 79};
        System.out.println("Mảng 2: " + Arrays.toString(ar2));
        insertionSort(ar1);
        System.out.println(Arrays.toString(ar1));
    }
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
