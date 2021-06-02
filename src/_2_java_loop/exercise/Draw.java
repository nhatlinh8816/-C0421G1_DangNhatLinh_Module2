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
                    for (int i = 1;i<=5;i++){
                        for (int j =1; j<=4;j++){
                            System.out.print("*");
                        }
                    }
            }
        }
    }
}
