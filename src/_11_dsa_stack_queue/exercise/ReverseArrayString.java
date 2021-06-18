package _11_dsa_stack_queue.exercise;

import java.util.Stack;

public class ReverseArrayString {
    public static void main(String[] args) {
        String string = "Có một cái cây trong một cái vườn";
        String[]word = string.split(" ");
        Stack<String> array = new Stack<>();
        Stack<String>reverseArray = new Stack<>();
       for (int i =0;i<word.length;i++){
           array.push(word[i]);
       }
        System.out.println("Before" + array);
        while (!array.isEmpty()){
            String element = array.peek();
            array.pop();
            reverseArray.push(element);
        }
        System.out.println("After" + reverseArray);
    }
}
