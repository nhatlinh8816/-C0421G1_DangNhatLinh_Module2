package _01_introduction_to_java.practice;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please in put your weight in kilogram");
        double weight = scanner.nextDouble();
        System.out.println("Please in put your height in meter");
        double height = scanner.nextDouble();
        double bmi = weight/Math.pow(height,2);
        System.out.println("Your BMI is "+bmi);
        if (bmi<18.5){
            System.out.println("You are Underweight" );
        } else if (bmi<25){
            System.out.println("You are Normal" );
        }else if (bmi<30){
            System.out.println("You are Overweight" );
        }else {
            System.out.println("You are Obese with" );
        }
    }
}
