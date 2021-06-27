package _15_exception.exercise;

import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public static Scanner input = new Scanner(System.in);
    public void checkTriangle(int a,int b, int c) throws IllegalTriangleExceptionCase1, IllegalTriangleExceptionCase2 {
        if (a<=0||b<=0||c<=0) {
            throw new IllegalTriangleExceptionCase1();
        }else if(a+b<=c||a+c<=b||c+b<=a){
            throw new IllegalTriangleExceptionCase2();
        }
        else {
            System.out.println("Là 3 cạnh của tam giác");
        }

}

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try{
            System.out.println("Nhập độ dài cạnh thứ nhất");
            int a = input.nextInt();
            System.out.println("Nhập độ dài cạnh thứ hai");
            int b = input.nextInt();
            System.out.println("Nhập độ dài cạnh thứ ba");
            int c = input.nextInt();
            triangle.checkTriangle(a,b,c);
        }
        catch (IllegalTriangleExceptionCase1 | IllegalTriangleExceptionCase2 e){
            System.err.println(e.getMessage());
        }
    }
}
