package _2_java_loop.practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Nhập số bất kỳ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number+" is not prime");
        } else {
            int countPrime = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    countPrime++;
                }
            }
            if (countPrime == 2) {
                System.out.println(number+" is prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        }
    }
}