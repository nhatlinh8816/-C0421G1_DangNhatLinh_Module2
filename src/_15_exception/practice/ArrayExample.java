package _15_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Scanner scanner = new Scanner(System.in);
    public Integer[] creatRandom100(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[]array = arrayExample.creatRandom100();
        System.out.println("input an index");
        try {
            int a = scanner.nextInt();
            System.out.println("Index " + a + " have value is " + array[a]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Index out of array length");
        }
    }
}
