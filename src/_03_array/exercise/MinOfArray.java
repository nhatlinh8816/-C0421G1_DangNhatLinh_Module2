package _03_array.exercise;

import _04_oop_class_object.excercise.StopWatch;

import java.util.Scanner;

public class MinOfArray {
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
