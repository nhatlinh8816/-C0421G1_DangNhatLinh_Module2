package _03_array.exercise;

import java.util.Scanner;

public class Nháp {
    public static void main(String[] args) {
        int n;   //khai báo biến n
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng");
            n = scanner.nextInt();       // lấy số lượng phần tử trong mảng nhập từ bàn phím
        }while (n<=0);
        int[]array = new int[n];     //Khai báo mảng với độ dài mảng là n;
        System.out.println("Nhập các phần tử cho mảng");
        for (int i=0; i<n; i++){
            System.out.println("Nhập phần tử thứ "+i+":");   //Nhập từng phần tử cho mảng
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử cần xóa");
        int c;
        c = scanner.nextInt();  //Nhập phần tử c từ bàn phím;
        int deleteIndex = 0;
        for (int i = 0;i<n;i++){
            if (c==array[i]){
                deleteIndex = i;
            }
        }
        if (deleteIndex != n-1) {
            for (int j = deleteIndex; j < n; j++) {
                array[deleteIndex] = array[deleteIndex + 1];
            }
        }else {
            array[n-1]=0;
        }
        for (int i = deleteIndex; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[n-1] = 0;
        for (int i = 0; i<n; i++){
            System.out.println(array[i]);
        }

    }
    }

