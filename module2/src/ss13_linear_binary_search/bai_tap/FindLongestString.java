package ss13_linear_binary_search.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = sc.nextLine();
        findLongestString(string);
    }
    public static void findLongestString(String string){
        LinkedList<Character> listmax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > listmax.size()) {
                listmax.clear();
                listmax.addAll(list);
            }
        }
        for (Character ch : listmax) {
            System.out.print(ch);
        }
    }
}
