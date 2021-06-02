package _01_introduction_to_java.excecise;

import java.util.Scanner;

public class CovertUSDtoVND {
    public static void main(String[] args) {
        System.out.println("Please enter the amount in USD ");
        Scanner scanner = new Scanner(System.in);
        float usd = scanner.nextFloat();
        float vnd = usd*23000;
        System.out.println(usd+" USD ~ "+vnd+" VND");
    }
}
