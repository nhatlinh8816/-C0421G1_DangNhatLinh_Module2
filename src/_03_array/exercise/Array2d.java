package _03_array.exercise;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        int m, i, j;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của ma trận");
            m = input.nextInt();
        } while (m <= 0);
        int[][] maxtrix = new int[m][m];
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Nhập phần tử tại vị trí hàng " + i + " cột " + j);
                maxtrix[i][j] = input.nextInt();
            }
        }
        int sum = 0;
            for (i = 0; i < m; i++) {
                    sum += maxtrix[i][i];
            }
        System.out.println("Tổng phần tử theo đường chéo của ma trận là "+sum);
        }
    }

