package _11_dsa_stack_queue.exercise;

import java.util.Stack;

public class ReverseArrayInteger {
    public static void main(String[] args) {
        Stack<Integer>array = new Stack<>();
        Stack<Integer>reverseArray = new Stack<>();
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
        System.out.println("Before" + array);
        while (!array.isEmpty()){
            int element = array.peek();
            array.pop();
            reverseArray.push(element);
        }
        System.out.println("After" + reverseArray);
    }
}
