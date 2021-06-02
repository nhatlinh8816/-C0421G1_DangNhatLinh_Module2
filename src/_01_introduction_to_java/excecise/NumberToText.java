package _01_introduction_to_java.excecise;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberToText ="";

        if (number < 0) {
            System.out.println("Number is invalid");
        } else if (number <= 12) {
            switch (number) {
                case 0:
                    numberToText = "Zero";
                    break;
                case 1:
                    numberToText = "One";
                    break;
                case 2:
                    numberToText = "Two";
                    break;
                case 3:
                    numberToText = "Three";
                    break;
                case 4:
                    numberToText = "Four";
                    break;
                case 5:
                    numberToText = "Five";
                    break;
                case 6:
                    numberToText = "Six";
                    break;
                case 7:
                    numberToText = "Seven";
                    break;
                case 8:
                    numberToText = "Eight";
                    break;
                case 9:
                    numberToText = "Nine";
                    break;
                case 10:
                    numberToText = "Ten";
                    break;
                case 11:
                    numberToText = "Eleven";
                    break;
                case 12:
                    numberToText = "Twelve";
                    break;
            }
        } else if (number<=19){
                
        }
        System.out.println(numberToText);
    }
}