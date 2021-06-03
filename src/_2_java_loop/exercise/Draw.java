package _2_java_loop.exercise;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner enter = new Scanner(System.in);
        while (choice!=4){
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Please enter your choice");
            choice = enter.nextInt();
            switch (choice){
                case 1:
                    for (int i = 1;i<=4;i++){
                        for (int j =1; j<=5;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i= 1; i<=5;i++){
                        for (int j =1; j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }System.out.println("");
                    for (int i= 5; i>=1;i--){
                        for (int j =1; j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:

                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Number is invalid ");
            }
        }
    }
}
