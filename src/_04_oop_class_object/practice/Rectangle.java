package _04_oop_class_object.practice;

import java.util.Scanner;

public class Rectangle {
    double width,height;  //khai báo thuộc tính width và height của lớp Rectangle;
    public Rectangle(){   //khai báo phương thức contrusctor
    }
    public Rectangle(double width,double height){       //khai báo phương thức contrucstor
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getParimetter(){
        return (this.width+this.height)*2;
    }
    public String displayRectangle (){
        return "Rectangle with width is "+width+" and height is "+height;
    }
    public static void main(String[] args) {
        // nhập chiều cao và chiều rộng từ bàn phím
        System.out.println("Input width");
        double width = input.nextDouble();
        System.out.println("Input height");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);  //khởi tạo đối tượng rectangle từ class Rectangle
        System.out.println("Information: "+rectangle.displayRectangle());   //gọi phương thức hiển thị thông tin đối tượng rectangle
        System.out.println("the Rectangle have area is "+rectangle.getArea()); //gọi phương thức tính diện tích đối tượng rectangle
        System.out.println("the Rectangle have parimetter is "+rectangle.getParimetter());  //gọi phương thức tính chu vi đối tượng rectangle
    }
    public static Scanner input = new Scanner(System.in);
}

