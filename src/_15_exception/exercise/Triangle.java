package _15_exception.exercise;

import java.util.Scanner;

public class Triangle {
    public static Scanner input = new Scanner(System.in);
    public void checkTriangle(int a,int b, int c) throws IllegalTriangleException {
        if (a<=0||b<=0||c<=0||a+b<=c||a+c<=b||c+b<=a) {
            throw new IllegalTriangleException();
        }
        else {
            System.out.println("Là 3 cạnh của tam giác");
        }

}

    public static void main(String[] args) throws IllegalTriangleException {
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
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }



    }
}
