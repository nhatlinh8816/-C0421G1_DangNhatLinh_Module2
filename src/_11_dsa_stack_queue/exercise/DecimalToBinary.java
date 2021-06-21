package _11_dsa_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (a!=0){
            int b = a%2;
            stack.push(b);
            a=(a-b)/2;
        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            int b = stack.pop();
            System.out.print(b);
        }


    }
}
