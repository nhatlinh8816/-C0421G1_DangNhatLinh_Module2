package _03_array.practice;

import java.util.Scanner;

public class MinOfArrayMethod {
    public static void main(String[] args) {
        int m, i;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter array length");
            m = input.nextInt();
        } while (m <= 0);
        int[] array = new int[m];
        for (i = 0; i < m; i++) {
            System.out.println("Please enter element of index " + i + ":");
            array[i] = input.nextInt();
        }
        System.out.println("Min of array is "+minOfArray(array));
    }
        public static int minOfArray(int[]array){
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min ) {
                    min = array[i];
                }
            }
            return min;
        }
}
