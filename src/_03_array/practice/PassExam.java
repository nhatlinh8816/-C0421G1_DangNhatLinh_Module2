package _03_array.practice;

import java.util.Scanner;

public class PassExam {
    public static void main(String[] args) {
        int m,i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài cho mảng");
            m = input.nextInt();
        }while (m<=0&&m>30);
        int[]testScore = new int[m];
        for (i=0;i<m;i++){
            System.out.println("Nhập điểm cho học sinh "+(i+1)+":");
            testScore[i] = input.nextInt();
        }
        int count = 0;
        for (i=0;i<m;i++){
            if (testScore[i]>=5&&testScore[i]<=10){
                count++;
            }
        }
        System.out.println("số sinh viên thi đỗ là "+count);
    }
}
