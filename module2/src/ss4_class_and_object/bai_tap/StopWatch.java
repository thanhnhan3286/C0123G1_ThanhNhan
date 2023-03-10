package ss4_class_and_object.bai_tap;

import java.util.Scanner;

public class StopWatch {
    long startTime, endTime;

    public StopWatch() {
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
        StopWatch stopwatch = new StopWatch();
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
