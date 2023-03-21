package ss13_linear_binary_search.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindAscendingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = sc.nextLine();
        findAscendingSeries(string);
    }

    public static void findAscendingSeries(String str) {
        LinkedList<Character> listMax = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(list.size()>listMax.size()){
                listMax.clear();
                listMax.addAll(list);
            }
            list.clear();
        }
        for (Character ch : listMax) {
            System.out.print(ch);
        }
    }
}
