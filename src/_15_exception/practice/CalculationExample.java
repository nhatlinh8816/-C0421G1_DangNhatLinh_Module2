package _15_exception.practice;

import java.util.Scanner;

public class CalculationExample {
    public static Scanner input = new Scanner(System.in);
    public void calculate(int x, int y){

        try {
            int total = x+y;
            int difference = x-y;
            int product = x*y;
            int quotient = x/y;
            System.out.println("total is " +total);
            System.out.println("difference is "+difference );
            System.out.println("product is "+product);
            System.out.println("quotient is "+quotient);
        }catch (Exception e){
            System.err.println("Exception"+e.getMessage());
        }

    }

    public static void main(String[] args) {
        System.out.println("Input first number");
        int x = input.nextInt();
        System.out.println("Input second number");
        int y = input.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
