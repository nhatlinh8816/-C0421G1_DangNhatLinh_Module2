package _01_introduction_to_java.practice;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the year you want to check");
        int year = scanner.nextInt();
        boolean yesOrNo = false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    yesOrNo = true;
                }else {
                    yesOrNo = false;
                }
            }else {
                yesOrNo = true;
            }
        }
        if (yesOrNo){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
}
