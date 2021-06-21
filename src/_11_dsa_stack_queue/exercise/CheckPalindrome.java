package _11_dsa_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static boolean check;
    public static void main(String[] args) {
        System.out.println("Input String");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String string1 = string.toLowerCase();
        String[] word = string1.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < word.length; i++) {
            stack.push(word[i]);
            queue.add(word[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        for (int i = 0; i < word.length; i++) {
            String a = stack.peek();
            String b = queue.peek();
            if (a.equals(b)){
                check = true;
            }else {
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Is not Palindrome");
        }
    }
}

