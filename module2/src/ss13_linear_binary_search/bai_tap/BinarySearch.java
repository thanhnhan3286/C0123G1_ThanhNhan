package ss13_linear_binary_search.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("Nhập lần lượt các phần tử");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng đã nhập: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        System.out.println("Nhập phần tử cần tìm: ");
        int value = Integer.parseInt(sc.nextLine());

        int result = binarySearch(arr, 0, n - 1, value);
        if (result == -1) {
            System.out.println(value + " không tìm thấy");
        } else {
            System.out.println(value + " nằm ở vị trí thứ " + result);
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (arr[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
