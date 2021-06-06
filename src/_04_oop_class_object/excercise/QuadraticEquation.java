package _04_oop_class_object.excercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){
    }
    public  QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getParametterA(){
        return this.a;
    }
    public double getParametterB(){
        return this.b;
    }
    public double getParametterC(){
        return this.c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.pow((b*b-4*a*c),0.5))/2*a;
        } else {
            return 0;
        }
    }
    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.pow((b*b-4*a*c),0.5))/2*a;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a");
        double a = input.nextDouble();
        System.out.println("Input b");
        double b = input.nextDouble();
        System.out.println("Input c");
        double c = input.nextDouble();
        QuadraticEquation equation1 = new QuadraticEquation(a,b,c);
        System.out.println("Equation has parametter a is "+equation1.getParametterA());
        System.out.println("Equation has parametter b is "+equation1.getParametterB());
        System.out.println("Equation has parametter c is "+equation1.getParametterC());
        double delta = equation1.getDiscriminant();
        if (delta > 0) {
            System.out.println("This equation has root 1 is "+equation1.getRoot1()+" and root 2 is"+equation1.getRoot2());
        }else if (delta==0){
            System.out.println("This equation has double root is "+equation1.getRoot1());
        } else {
            System.out.println("This equation has no root");
        }
    }
}

