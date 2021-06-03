package _03_array.exercise;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int n = 0;          //khai báo số nguyên n
        Scanner scanner = new Scanner(System.in);
        while (n<=0){
            System.out.println("Nhập độ dài mảng");
            n = scanner.nextInt();          //Nhập độ dài mảng từ bàn phím;
        }
        int[]array = new int[n];
        System.out.println("Nhập các phần tử cho mảng");
        for (int i = 0; i<n;i++){
            System.out.println("Nhập phần tử vị trí "+i+":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử bạn muốn thêm vào mảng");
        int c = scanner.nextInt();
        int addIndex=0;
        do {
            System.out.println("Nhập vị trí phần tử bạn muốn thêm ");
            addIndex = scanner.nextInt();
        }while (addIndex<0&&addIndex>n-1);
            for (int i = n-1;i>addIndex;i--){
                    array[i] = array[i-1];
            }
            array[addIndex] = c;
        for (int i =0; i<n;i++){
            System.out.println(array[i]);
        }
    }
}
