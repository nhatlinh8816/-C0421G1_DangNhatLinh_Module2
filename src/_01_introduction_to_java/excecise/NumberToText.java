package _01_introduction_to_java.excecise;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hangtram = number / 100;
        int hangchuc = (number - hangtram * 100) / 10;
        int hangdonvi = (number - hangtram * 100 - hangchuc * 10);
        switch (hangdonvi){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
        switch (hangchuc){
            case 1:
                System.out.println("ten");
                break;
            case 2:
                System.out.println("twelve");
                break;
            case 3:
                System.out.println("thirty");
                break;
            case 4:
                System.out.println("Fourty");
                break;
            case 5:
                System.out.println("Fifty");
                break;
            case 6:
                System.out.println("Sixty");
                break;
            case 7:
                System.out.println("Seventy");
                break;
            case 8:
                System.out.println("Eighty");
                break;
            case 9:
                System.out.println("Ninety");
                break;
        }
        switch (hangtram){
            case 100:
                System.out.println("One hundred");
                break;
            case 200:
                System.out.println("Two hundred");
                break;
            case 300:
                System.out.println("Three hundred");
                break;
            case 400:
                System.out.println("Four hundred");
                break;
            case 500:
                System.out.println("Five hundred");
                break;
            case 600:
                System.out.println("Six hundred");
                break;
            case 700:
                System.out.println("Seven hundred");
                break;
            case 800:
                System.out.println("Eight hundred");
                break;
            case 900:
                System.out.println("Nine hundred");
                break;
        }
        if (number>=100&&number<=999){
            hangtram;
            hangchuc;
            hangdonvi;
        }
    }
}