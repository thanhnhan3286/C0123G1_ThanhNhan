package ss2_Vong_lap_trong_Java.Bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int countThuong = 0;
        for (int a = 2; a < 10000; a++) {
            if (count < 20) {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0) {
                        countThuong += 1;
                    }
                }
                if(countThuong == 2){
                    System.out.println(a);
                    count++;
                }
                countThuong = 0;
            }
        }
    }
}
