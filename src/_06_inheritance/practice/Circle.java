package _06_inheritance.practice;

public class Circle extends Shape {
    double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled ) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }
     public boolean getFilled() {
        return this.filled;
     }
     public void setColor(String color){
        this.color = color;
     }
     public void setFilled(boolean filled){
        this.filled = filled;
     }
     public double getArea(){
        return radius*radius*Math.PI;
     }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius "+radius+" which is a subclass of "+ super.toString();
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.5, "indigo", false);
        System.out.println(circle3);
    }
}
