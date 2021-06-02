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
        if (number<=12){
            switch (number){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 10:
                    System.out.print("Ten ");
                    break;
                case 11:
                    System.out.print("Eleven ");
                    break;
                case 12:
                    System.out.print("Twelve ");
                    break;
            }
        }else if (number<20){
            switch (number){
                case 13:
                    System.out.print("Thirteen ");
                    break;
                case 14:
                    System.out.print("Fourteen ");
                    break;
                case 15:
                    System.out.print("Fifteen ");
                    break;
                case 16:
                    System.out.print("Sixteen ");
                    break;
                case 17:
                    System.out.print("Seventeen ");
                    break;
                case 18:
                    System.out.print("Eightteen ");
                    break;
                case 19:
                    System.out.print("Nineteen ");
                    break;
            }
        }else if (number<1000){
            hangtram(hangtram);
            hangchuc(hangchuc);
            hangdonvi(hangdonvi);
        }


    }
    public static void hangdonvi(int num) {
        switch (num) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            default:
                System.out.println("");
        }
    }
    public static void hangchuc(int num) {
        switch (num) {
            case 2:
                System.out.print("twelty ");
                break;
            case 3:
                System.out.print("thirty ");
                break;
            case 4:
                System.out.print("Fourty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
            default:
                System.out.println("");
        }
    }
    public static void hangtram(int num) {
        switch (num) {
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;
            default:
                System.out.print("");
        }
    }
    }
