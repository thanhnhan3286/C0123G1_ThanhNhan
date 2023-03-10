package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args){
        int countThuong = 0;
        for (int a = 2; a < 100; a++) {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0) {
                        countThuong += 1;
                    }
                }
                if(countThuong == 2){
                    System.out.println(a);;
                }
                countThuong = 0;
            }
        }
    }
