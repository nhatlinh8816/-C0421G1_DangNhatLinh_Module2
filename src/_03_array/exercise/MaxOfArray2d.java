package _03_array.exercise;

import java.util.Scanner;

public class MaxOfArray2d {
    public static void main(String[] args) {
        int m, n, i, j = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            m = scanner.nextInt();
        } while (m <= 0);
        do {
            System.out.println("Nhập độ dài cho từng phần tử của mảng");
            n = scanner.nextInt();
        } while (n <= 0);
        int[][] array = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Nhập phần tử tại vị trí hàng " + i + " cột " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (array[i][j] > max) ;
                max = array[i][j];
            }
        }
        System.out.println("Max in array is "+max+" tại vị trí hàng "+i+" cột "+j);
    }
}