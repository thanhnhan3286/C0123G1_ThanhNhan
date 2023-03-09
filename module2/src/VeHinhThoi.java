import java.util.Scanner;

public class VeHinhThoi {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int x = 6; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = 2; j <= i * 2 - 1; j++) {
                if (j == i * 2 - 1 || j == 2) {
                    System.out.print(i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 5; i >=1; i--) {
            for (int x = 5; x >= i; x--) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j >=2 ; j--) {
                if (j == i * 2 - 1 || j == 2) {
                    System.out.print(i - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}