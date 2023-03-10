package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số từ 0 -> 999: ");
            int so = Integer.parseInt(sc.nextLine());
            if (so > 0) {
                if (so > 19) {
                    if (so > 100) {
                        if (so > 1000) {
                            System.out.print("Số vừa nhập lớn hơn 999" + '\n');
                        } else {
                            int a = so / 100;
                            int b = (so % 100);
                            int c = (so % 100) % 10;
                            if (b > 0) {
                                System.out.print(donVi(a) + " hundered and " + chuc(b) + donVi(c) + '\n');
                            } else {
                                System.out.print(donVi(a) + " hundered " + chuc(b) + donVi(c) + '\n');
                            }
                        }
                    } else {
                        int b = so % 10;
                        System.out.print(chuc(so) + donVi(b) + '\n');
                    }
                } else {
                    System.out.print(donVi(so) + '\n');
                }
            } else if (so == 0) {
                System.out.println("Zero");

            } else {
                System.out.print("Số không thỏa mãn" + '\n');
            }
        } while (1 > 0);
    }


    public static String donVi(int a) {
        switch (a) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String chuc(int b) {
        int b1 = b / 10;
        switch (b1) {
            case 1:
                return donVi(b);
            case 2:
                return "twenty ";
            case 3:
                return "thirty ";
            case 4:
                return "forty ";
            case 5:
                return "fifty ";
            case 6:
                return "sixty ";
            case 7:
                return "seventy ";
            case 8:
                return "eighty ";
            case 9:
                return "ninety ";
            default:
                return "";
        }
    }
}