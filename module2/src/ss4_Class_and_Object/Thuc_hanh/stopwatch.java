package ss4_Class_and_Object.Thuc_hanh;

import java.util.Scanner;

public class stopwatch {
    long startTime, endTime;
    public stopwatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long start(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }
    public long stop(){
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
    public long getElapsedTime(){
        long elaspedTime = this.endTime - this.startTime;
        return elaspedTime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stopwatch stopwatch = new stopwatch();
        System.out.println("Nhập 1 để bắt đầu: ");
        int c = sc.nextInt();
        if (c == 1) {

        }
    }
}