package ss4_Class_and_Object.Thuc_hanh;

import java.util.Scanner;

public class stopwatch {
    long startTime, endTime;

    public stopwatch() {
    }

    private long getStartTime() {
        return startTime;
    }

    private long getEndTime() {
        return endTime;
    }

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        long elaspedTime = endTime - startTime;
        return elaspedTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stopwatch stopwatch = new stopwatch();
        int c = 0;
        do {
            System.out.println("Nhập 1 để bắt đầu: ");
            c = sc.nextInt();
            if (c == 1) {
                stopwatch.start();
            }
        } while (c != 1);
        int d = 1;
        do {
            System.out.println("Nhập 0 để kết thúc: ");
            d = sc.nextInt();
            if (d == 0) {
                stopwatch.stop();
            }
        } while (d != 0);
        System.out.println("Đếm được số milisecond giây: " + stopwatch.getElapsedTime() + "s");
    }
}