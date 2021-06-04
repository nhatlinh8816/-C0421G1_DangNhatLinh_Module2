package _03_array.practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int select;
        double c;
        Scanner enter = new Scanner(System.in);
        do {
            System.out.println("Selection List");
            System.out.println("1.Celsius to Fahrenheit");
            System.out.println("2.Fahrenheit to Celsius");
            System.out.println("0.Exit");
            System.out.println("Please input your seletion");
            select = enter.nextInt();
            switch (select){
                case 1:
                    System.out.println("Please input Celsius Temperature");
                    c = enter.nextDouble();
                    System.out.println("Fahrenheit temperature is "+celsiusToFahrenheit(c));
                    break;
                case 2:
                    System.out.println("Please input Fahrenheit Temperature");
                    c = enter.nextDouble();
                    System.out.println("Celsius temperature is "+fahrenheitToCelsius(c));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (select!=0);
    }
    public static double celsiusToFahrenheit(double c){
        double f;
        f = c/(5.0*9)+32;
        return f;
    }
    public static double fahrenheitToCelsius(double f){
        double c;
        c = (5.0 / 9) * (f - 32);
        return c;
    }
}
