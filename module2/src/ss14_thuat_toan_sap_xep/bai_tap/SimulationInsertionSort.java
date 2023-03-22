package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class SimulationInsertionSort {
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 4, 7, 3, 2, 6, 0, 9, 8};
        System.out.println("Mảng 1: " + Arrays.toString(ar1));
        int[] ar2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng 2: " + Arrays.toString(ar2));
        simulationInsertionSort(ar1);
    }

    public static void simulationInsertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("Lần thứ " + i + '-' + pos + " " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("Sau lần thứ " + i + '-' + pos + " " + Arrays.toString(array));
        }
    }
}
