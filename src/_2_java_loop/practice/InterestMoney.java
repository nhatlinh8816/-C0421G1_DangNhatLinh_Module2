package _2_java_loop.practice;

import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of deposits");
        Scanner scanner = new Scanner(System.in);
        float deposits = scanner.nextFloat();
        System.out.println("Please enter interest rate per year");
        Scanner scanner1 = new Scanner(System.in);
        float rate = scanner1.nextFloat();
        System.out.println("Please enter the amount of month you want to saving");
        Scanner scanner2 = new Scanner(System.in);
        int month = scanner2.nextInt();
        float interestMoney = deposits*rate/12*month;
        for (int i = 0;i<month;i++){
            interestMoney++;
        }
        System.out.println("Total money you have is "+interestMoney);
    }
}
