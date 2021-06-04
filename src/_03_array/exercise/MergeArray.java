package _03_array.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int n,m,i;      //khai báo số nguyên m,n,i
        Scanner enter = new Scanner(System.in);
        //Nhập độ dài mảng 1
     do {
         System.out.println("Nhập độ dài mảng 1");
         n = enter.nextInt();
     }while (n<=0);
     int[]array1 = new int[n];  //KHởi tạo mảng 1 có đọ dài n
     // Nhập từng phần tử mảng 1
        for (i = 0;i<n;i++){
            System.out.println("Nhập phần tử vị trí "+i+":");
            array1[i] = enter.nextInt();
        }
      // Nhập độ dài mảng 2;
        do {
            System.out.println("Nhập độ dài mảng 2");
            m = enter.nextInt();
        }while (m<=0);
        int[]array2 = new int[m];   //KHởi tạo mảng 2 có đọ dài m;
      // Nhập từng phần tử cho mảng 2;
        for (i = 0; i<m;i++){
            System.out.println("Nhập phần tử  tại vị trí "+i+":");
            array2[i] = enter.nextInt();
        }
        int[]array3 = new int[m+n];   //KHởi tạo mảng 3 có đọ dài m+n;
        for(i=0;i<n;i++){
            array3[i] = array1[i];
        }
        for(i=n;i<n+m;i++){
            array3[i] = array2[i-n];
        }
        for (i=0; i<n+m;i++){
            System.out.println(array3[i]);
        }
    }
}
