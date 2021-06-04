package _03_array.practice;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        int m,i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            m = input.nextInt();
        } while (m<=1);
        int[]array = new int[m];
        for (i=0;i<m;i++){
            System.out.println("nhập phần tử tại ví trí "+i+":");
            array[i] = input.nextInt();
        }
        int first;
        int last;
        int c;
        for (first=0,last = m - 1;first<last;first++,last-- ){
            c = array[first];
            array[first]=array[last];
            array[last]=c;
        }
        for (i=0;i<m;i++){
            System.out.println(array[i]);
        }
    }
}
