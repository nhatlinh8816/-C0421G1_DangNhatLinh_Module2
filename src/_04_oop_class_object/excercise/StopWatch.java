package _04_oop_class_object.excercise;

import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    LocalTime startTime;
    LocalTime endTime;
    public StopWatch(){
        startTime = LocalTime.now();
    }
    public StopWatch(LocalTime startTime,LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public LocalTime getStartTime(){
        return startTime;
    }
    public void start(){
        startTime = LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        return  ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60
                + (endTime.getSecond()-startTime.getSecond())*1000);
    }
    public static class MinOfArray {
        public static void main(String[] args) {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            int m,i; //khai báo số nguyên m,i;
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Nhập độ dài mảng");
                m = input.nextInt();
            }while (m<=0);
            int[]array = new int[m];   //khai báo mảng array có độ dài m;
            for (i=0;i<m;i++){
                System.out.println("Nhập phần tử tại vị trí "+i+":");
                array[i] = input.nextInt();
            }
            int min = array[0];
            for (i=1;i<m;i++){
                if (array[i]<min){
                    min = array[i];
                }
            }System.out.println("Min of array is "+min);
            stopWatch.stop();
            System.out.println(stopWatch.getElapsedTime());
        }
    }

}
