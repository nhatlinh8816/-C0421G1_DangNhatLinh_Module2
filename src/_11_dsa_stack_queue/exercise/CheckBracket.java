package _11_dsa_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    private static boolean check;
    public static void main(String[] args) {
        System.out.println("Nhập biểu thức");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        Stack<String>bStack = new Stack<String>();
        String[]word = string.split("");
        for (int i =0;i<word.length;i++){
           if (word[i].equals("(")){
               bStack.push(word[i]);
           }
           else if (word[i].equals(")")){
               if (bStack.isEmpty()){
                   check = false;
                   break;
               } else {
                   bStack.pop();
               }
           }
            if (bStack.isEmpty()){
                check = true;
            }
        }
        if (!bStack.isEmpty()){
            check = false;
        }
        System.out.println(check);

    }
}
